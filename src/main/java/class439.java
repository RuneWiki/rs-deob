import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class439 extends class82 {
   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5982 = new String[]{method3392(method3391("0\u0006\rL\u001d")), method3392(method3391("0\u001eOd")), method3392(method3391("%E\r&H")), method3392(method3391("0\u0006\rM\u001d")), method3392(method3391("0\u0006\rN\u001d")), method3392(method3391("0\u0006\rO\u001d"))};
   @OriginalMember(
      owner = "client!nm",
      name = "m",
      descriptor = "[Ljava/awt/Rectangle;"
   )
   public static Rectangle[] field5975 = new Rectangle[100];
   @OriginalMember(
      owner = "client!nm",
      name = "i",
      descriptor = "Ldja;"
   )
   public static class45 field5979;
   @OriginalMember(
      owner = "client!nm",
      name = "n",
      descriptor = "I"
   )
   public static int field5974;
   @OriginalMember(
      owner = "client!nm",
      name = "l",
      descriptor = "I"
   )
   public static int field5976;
   @OriginalMember(
      owner = "client!nm",
      name = "j",
      descriptor = "I"
   )
   public static int field5977;
   @OriginalMember(
      owner = "client!nm",
      name = "g",
      descriptor = "I"
   )
   public static int field5981;
   @OriginalMember(
      owner = "client!nm",
      name = "k",
      descriptor = "Lnm;"
   )
   public class439 field5973;
   @OriginalMember(
      owner = "client!nm",
      name = "o",
      descriptor = "Lnm;"
   )
   public class439 field5978;
   @OriginalMember(
      owner = "client!nm",
      name = "h",
      descriptor = "[Lpd;"
   )
   public static class648[] field5980;

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3387(int arg0) {
      try {
         ++field5977;
         if (arg0 <= 95) {
            field5980 = null;
         }

         if (this.field5978 != null) {
            this.field5978.field5973 = this.field5973;
            this.field5973.field5978 = this.field5978;
            this.field5973 = null;
            this.field5978 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5982[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3388(int arg0) {
      try {
         ++field5976;
         class599.method4459();
         if (arg0 != 1) {
            method3389((byte)4);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5982[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3389(byte arg0) {
      try {
         field5979 = null;
         if (arg0 >= -71) {
            method3388(106);
         }

         field5980 = null;
         field5975 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5982[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(Lmv;B)V"
   )
   public static final void method3390(class330 arg0, byte arg1) {
      boolean var2 = client.field1481;

      RuntimeException var10000;
      label42: {
         boolean var10001;
         class330 var3;
         try {
            ++field5981;
            arg0.field4559 = false;
            if (arg0.field4557 != null) {
               arg0.field4557.field4713 = 0;
            }

            var3 = arg0.method1961();
            if (arg1 != -124) {
               return;
            }
         } catch (RuntimeException var7) {
            var10000 = var7;
            var10001 = false;
            break label42;
         }

         while(true) {
            label37: {
               try {
                  if (var3 != null) {
                     method3390(var3, (byte)-124);
                     break label37;
                  }
               } catch (RuntimeException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }

               if (!var2) {
                  return;
               }
            }

            try {
               var3 = arg0.method1949();
            } catch (RuntimeException var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var4 = var10000;
      throw class93.method866(var4, field5982[0] + (arg0 != null ? field5982[2] : field5982[1]) + ',' + arg1 + ')');
   }

   static {
      for(int var0 = 0; ~var0 > -101; ++var0) {
         field5975[var0] = new Rectangle();
      }

      field5979 = new class45(1);
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3391(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3392(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
