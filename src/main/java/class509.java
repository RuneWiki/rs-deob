import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class509 extends class557 {
   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7233 = new String[]{method3840(method3839("1SQc\u0006")), method3840(method3839("1SQh\u0006")), method3840(method3839("1SQa\u0006")), method3840(method3839("1SQk\u0006")), method3840(method3839("1SQl\u0006")), method3840(method3839("1SQj\u0006")), method3840(method3839("1SQo\u0006")), method3840(method3839("1SQn\u0006")), method3840(method3839("1SQm\u0006"))};
   @OriginalMember(
      owner = "client!kw",
      name = "k",
      descriptor = "I"
   )
   public static int field7227 = 0;
   @OriginalMember(
      owner = "client!kw",
      name = "p",
      descriptor = "I"
   )
   public static int field7223;
   @OriginalMember(
      owner = "client!kw",
      name = "i",
      descriptor = "I"
   )
   public static int field7224;
   @OriginalMember(
      owner = "client!kw",
      name = "j",
      descriptor = "I"
   )
   public static int field7226;
   @OriginalMember(
      owner = "client!kw",
      name = "h",
      descriptor = "I"
   )
   public static int field7228;
   @OriginalMember(
      owner = "client!kw",
      name = "m",
      descriptor = "I"
   )
   public static int field7229;
   @OriginalMember(
      owner = "client!kw",
      name = "l",
      descriptor = "I"
   )
   public static int field7230;
   @OriginalMember(
      owner = "client!kw",
      name = "n",
      descriptor = "I"
   )
   public static int field7231;
   @OriginalMember(
      owner = "client!kw",
      name = "q",
      descriptor = "I"
   )
   public static int field7232;
   @OriginalMember(
      owner = "client!kw",
      name = "o",
      descriptor = "Leh;"
   )
   public static class543 field7225;

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         super.field7905 = arg0;
         ++field7223;
         if (!arg1) {
            field7225 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7233[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class509(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!kw",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class509(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (~super.field7905 != -1 && ~super.field7906.field9119.method5500(-68) != -2) {
            super.field7905 = 0;
         }

         if (arg0 != -22) {
            field7227 = 37;
         }

         ++field7231;
         if (super.field7905 < 0 || ~super.field7905 < -2) {
            super.field7905 = this.method97(0);
         }

      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7233[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method3834(byte arg0) {
      try {
         ++field7226;
         if (arg0 != 108) {
            this.method92(36, 40);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7233[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method3835(int arg0) {
      try {
         ++field7230;
         if (!class164.field2484) {
            class612.method4504(class211.field3016, arg0 + -126);
            if (arg0 == 1) {
               if (class506.field7196 != null) {
                  class612.method4504(class506.field7196, -125);
               }

               class164.field2484 = true;
            }
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7233[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method3836(int arg0) {
      try {
         ++field7229;
         return arg0 >= -52 ? 66 : super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7233[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3837(boolean arg0) {
      try {
         ++field7232;
         if (arg0) {
            class513.field7285.method227(class279.field4230, class476.field6870.field9117.method3836(-121) != 1 ? -1 : class69.field1001 + 256 << 2, 0);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7233[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            field7227 = 48;
         }

         ++field7228;
         return 1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7233[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field7224;
         if (~arg1 != -1 && super.field7906.field9119.method5500(arg0 + -80) != 1) {
            if (arg0 != 1) {
               field7225 = null;
            }

            return 2;
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7233[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3838(int arg0) {
      try {
         if (arg0 != 492761538) {
            method3837(false);
         }

         field7225 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7233[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3839(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3840(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
