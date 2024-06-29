import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class763 extends class55 {
   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11277 = new String[]{method5539(method5538("zKCy&")), method5539(method5538("zKCp&")), method5539(method5538("zKC}&")), method5539(method5538("zKCq&")), method5539(method5538("zKC\u007f&")), method5539(method5538("zKC~&")), method5539(method5538("zKCz&")), method5539(method5538("zKC{&")), method5539(method5538("zKC|&"))};
   @OriginalMember(
      owner = "client!cc",
      name = "g",
      descriptor = "[Ljava/awt/Rectangle;"
   )
   public static Rectangle[] field11268 = new Rectangle[100];
   @OriginalMember(
      owner = "client!cc",
      name = "j",
      descriptor = "Leg;"
   )
   public static class118 field11274;
   @OriginalMember(
      owner = "client!cc",
      name = "l",
      descriptor = "Llea;"
   )
   public static class639 field11275;
   @OriginalMember(
      owner = "client!cc",
      name = "h",
      descriptor = "I"
   )
   public static int field11265;
   @OriginalMember(
      owner = "client!cc",
      name = "k",
      descriptor = "I"
   )
   public static int field11266;
   @OriginalMember(
      owner = "client!cc",
      name = "p",
      descriptor = "I"
   )
   public static int field11267;
   @OriginalMember(
      owner = "client!cc",
      name = "i",
      descriptor = "I"
   )
   public static int field11269;
   @OriginalMember(
      owner = "client!cc",
      name = "m",
      descriptor = "I"
   )
   public static int field11270;
   @OriginalMember(
      owner = "client!cc",
      name = "e",
      descriptor = "I"
   )
   public static int field11271;
   @OriginalMember(
      owner = "client!cc",
      name = "o",
      descriptor = "I"
   )
   public static int field11272;
   @OriginalMember(
      owner = "client!cc",
      name = "n",
      descriptor = "I"
   )
   public static int field11273;
   @OriginalMember(
      owner = "client!cc",
      name = "f",
      descriptor = "I"
   )
   public static int field11276;

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method98(int arg0) {
      try {
         ++field11271;
         super.field680 = this.method101(-119);
         if (arg0 != 0) {
            method5537(88);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11277[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "<init>",
      descriptor = "(Lifa;)V"
   )
   public class763(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(IIZ)I"
   )
   public static final int method5533(int arg0, int arg1, boolean arg2) {
      boolean var3 = client.field4360;

      try {
         ++field11272;
         if (arg0 == -2) {
            return 12345678;
         } else if (~arg0 == 0) {
            if (~arg1 > -3) {
               arg1 = 2;
               if (!var3) {
                  return arg1;
               }
            }

            if (~arg1 < -127) {
               arg1 = 126;
            }

            return arg1;
         } else {
            if (!arg2) {
               field11275 = null;
            }

            arg1 = (127 & arg0) * arg1 >> 7;
            if (~arg1 > -3) {
               arg1 = 2;
               if (!var3) {
                  return (65408 & arg0) + arg1;
               }
            }

            if (arg1 > 126) {
               arg1 = 126;
            }

            return (65408 & arg0) + arg1;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11277[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "<init>",
      descriptor = "(ILifa;)V"
   )
   public class763(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!cc",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method5534(int arg0) {
      try {
         ++field11265;
         int var2 = -111 % ((36 - arg0) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11277[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method97(int arg0, byte arg1) {
      try {
         if (arg1 != 105) {
            field11276 = 122;
         }

         ++field11269;
         return 3;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11277[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5535(int arg0) {
      try {
         ++field11273;
         if (class613.field9015) {
            class678 var1 = class504.method3657(-114, class573.field8327, class535.field7636);
            if (var1 != null && var1.field9863 != null) {
               class421 var2 = new class421();
               var2.field6014 = var1;
               var2.field6010 = var1.field9863;
               class200.method1583(var2);
            }

            class613.field9015 = false;
            class732.field10714 = arg0;
            class146.field1843 = -1;
            if (var1 != null) {
               class743.method5384(var1, (byte)-106);
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11277[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5536(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 32768) {
            return false;
         } else {
            ++field11267;
            return ~(arg1 & 32768) != -1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11277[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method5537(int arg0) {
      try {
         field11274 = null;
         if (arg0 > 52) {
            field11275 = null;
            field11268 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11277[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = 5 % ((arg1 - 47) / 46);
         ++field11266;
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11277[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method101(int arg0) {
      try {
         ++field11270;
         if (arg0 > -116) {
            return -117;
         } else {
            return super.field683.method3300((byte)-56) ? 1 : 0;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11277[5] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -101; ++var0) {
         field11268[var0] = new Rectangle();
      }

      field11274 = new class118(62, 10);
      field11275 = new class639(8, 7);
   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5538(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5539(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
