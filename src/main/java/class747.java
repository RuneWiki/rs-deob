import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class747 {
   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "Llj;"
   )
   private class304 field11081 = new class304(128);
   @OriginalMember(
      owner = "client!o",
      name = "d",
      descriptor = "Lrr;"
   )
   private class678 field11083;
   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11085 = new String[]{method5492(method5491("]\u001a=\u0010")), method5492(method5491("I\u001aR\u0016\u0016")), method5492(method5491("\\A\u0010T")), method5492(method5491("]\u001a@Q\u0005[@B\u0010")), method5492(method5491("]\u001a9\u0010")), method5492(method5491("]\u001a?\u0010")), method5492(method5491("]\u001a>\u0010")), method5492(method5491("]\u001a8\u0010"))};
   @OriginalMember(
      owner = "client!o",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field11077 = true;
   @OriginalMember(
      owner = "client!o",
      name = "h",
      descriptor = "I"
   )
   public static int field11078;
   @OriginalMember(
      owner = "client!o",
      name = "f",
      descriptor = "I"
   )
   public static int field11079;
   @OriginalMember(
      owner = "client!o",
      name = "g",
      descriptor = "I"
   )
   public static int field11080;
   @OriginalMember(
      owner = "client!o",
      name = "c",
      descriptor = "I"
   )
   public static int field11082;
   @OriginalMember(
      owner = "client!o",
      name = "b",
      descriptor = "I"
   )
   public static int field11084;

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(II)Los;"
   )
   public final class45 method5486(int arg0, int arg1) {
      try {
         ++field11078;
         class304 var3 = this.field11081;
         class45 var4;
         synchronized(this.field11081) {
            var4 = (class45)this.field11081.method2544(false, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field11083;
            byte[] var6;
            synchronized(this.field11083) {
               var6 = this.field11083.method5017(arg0, arg1, (byte)71);
            }

            class45 var7 = new class45();
            if (var6 != null) {
               var7.method329(new class354(var6), (byte)97);
            }

            class304 var8 = this.field11081;
            synchronized(this.field11081) {
               this.field11081.method2545((long)arg1, 109, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field11085[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5487(byte arg0) {
      try {
         int var1 = -125 / ((-7 - arg0) / 39);
         ++field11079;
         class108.field1491.method2554(-99);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11085[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5488(int arg0) {
      try {
         class304 var2 = this.field11081;
         synchronized(this.field11081) {
            this.field11081.method2551(true);
         }

         ++field11084;
         if (arg0 < 121) {
            method5487((byte)12);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11085[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V"
   )
   public class747(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field11083 = arg2;
         this.field11083.method4998((byte)-82, 1);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11085[3] + (arg0 != null ? field11085[1] : field11085[2]) + ',' + arg1 + ',' + (arg2 != null ? field11085[1] : field11085[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5489(int arg0) {
      try {
         class304 var2 = this.field11081;
         synchronized(this.field11081) {
            this.field11081.method2554(-116);
         }

         if (arg0 == 1) {
            ++field11080;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11085[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method5490(int arg0, int arg1) {
      try {
         ++field11082;
         class304 var3 = this.field11081;
         synchronized(this.field11081) {
            if (arg1 == 5469) {
               this.field11081.method2552(arg0, arg1 ^ 16704);
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field11085[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5491(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5492(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
