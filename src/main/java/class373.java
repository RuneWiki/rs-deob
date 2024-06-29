import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class373 {
   @OriginalMember(
      owner = "client!tc",
      name = "e",
      descriptor = "Lea;"
   )
   private class573 field5402;
   @OriginalMember(
      owner = "client!tc",
      name = "c",
      descriptor = "J"
   )
   public long field5403;
   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5407 = new String[]{method2840(method2839("54(pe/6j\u007fv$\u007f")), method2840(method2839("54(W$")), method2840(method2839("54(T$")), method2840(method2839("/\"jz")), method2840(method2839(":y(8q")), method2840(method2839("54(*e/>r($")), method2840(method2839("54(U$"))};
   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field5406 = new int[3];
   @OriginalMember(
      owner = "client!tc",
      name = "b",
      descriptor = "I"
   )
   public static int field5401;
   @OriginalMember(
      owner = "client!tc",
      name = "f",
      descriptor = "I"
   )
   public static int field5404;
   @OriginalMember(
      owner = "client!tc",
      name = "d",
      descriptor = "I"
   )
   public static int field5405;

   @OriginalMember(
      owner = "client!tc",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field5402.method4152(this.field5403, (byte)-61);
         ++field5405;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5407[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(Ljava/lang/String;B)I"
   )
   public static final int method2836(String arg0, byte arg1) {
      boolean var2 = client.field4360;

      try {
         ++field5401;
         int var3 = 0;
         if (var2) {
            if (class528.field7552[var3].equalsIgnoreCase(arg0)) {
               return var3;
            }

            ++var3;
         }

         while(true) {
            while(var3 < class528.field7552.length) {
               if (class528.field7552[var3].equalsIgnoreCase(arg0)) {
                  return var3;
               }

               ++var3;
            }

            if (!var2) {
               if (arg1 != -87) {
                  field5406 = null;
               }

               return -1;
            }

            if (arg1 != 0) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5407[6] + (arg0 != null ? field5407[4] : field5407[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method2837(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            field5406 = null;
         }

         ++field5404;
         return class207.method1643(arg1, arg2, (byte)60) || class738.method5356(arg1, arg2, -25085);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5407[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2838(int arg0) {
      try {
         field5406 = null;
         if (arg0 != 3) {
            field5406 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5407[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "<init>",
      descriptor = "(Lea;JI)V"
   )
   public class373(class573 arg0, long arg1, int arg2) {
      try {
         this.field5402 = arg0;
         this.field5403 = arg1;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5407[5] + (arg0 != null ? field5407[4] : field5407[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2839(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2840(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
