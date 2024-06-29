import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class465 {
   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6759 = new String[]{method3580(method3579("zjc8\u001c9")), method3580(method3579("j\",8\"")), method3580(method3579("zjc8\u001d9")), method3580(method3579("\u007fynz")), method3580(method3579("zjc8\u001e9"))};
   @OriginalMember(
      owner = "client!kfa",
      name = "c",
      descriptor = "[C"
   )
   public static char[] field6757 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "Liw;"
   )
   public static class107 field6756 = new class107(10);
   @OriginalMember(
      owner = "client!kfa",
      name = "b",
      descriptor = "I"
   )
   public static int field6755;
   @OriginalMember(
      owner = "client!kfa",
      name = "d",
      descriptor = "I"
   )
   public static int field6758;

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(IJII)V"
   )
   public static final void method3576(int arg0, long arg1, int arg2, int arg3) {
      try {
         ++field6755;
         if (arg2 != 4) {
            method3577(114, (class211)null);
         }

         int var5 = (int)arg1 >> 14 & 31;
         int var6 = ((int)arg1 & 3814024) >> 20;
         int var7 = (int)(arg1 >>> 32) & Integer.MAX_VALUE;
         if (var5 != 10 && ~var5 != -12 && var5 != 22) {
            class627.method4612(0, (byte)106, true, arg3, var5, var6, 0, 0, arg0);
         } else {
            class544 var8;
            int var9;
            int var10;
            label33: {
               var8 = class549.field7834.method3850(arg2 ^ 3913, var7);
               if (var6 != 0 && var6 != 2) {
                  var9 = var8.field7755;
                  var10 = var8.field7687;
                  if (!client.field10022) {
                     break label33;
                  }
               }

               var10 = var8.field7755;
               var9 = var8.field7687;
            }

            int var11 = var8.field7717;
            if (var6 != 0) {
               var11 = (15 & var11 << var6) - -(var11 >> -var6 + 4);
            }

            class627.method4612(var10, (byte)106, true, arg3, 0, 0, var11, var9, arg0);
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field6759[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(ILjq;)V"
   )
   public static final void method3577(int arg0, class211 arg1) {
      boolean var2 = client.field10022;

      try {
         ++field6758;
         boolean var3 = false;
         if (arg0 != 18774) {
            method3577(-106, (class211)null);
         }

         arg1.method962(false);
         class211 var4 = (class211)class142.field2268.method5225(true);
         boolean var10000;
         if (var2) {
            var10000 = class458.method3545(2259, arg1.method1824(110), var4.method1824(arg0 ^ 18749));
         } else if (var4 == null) {
            var10000 = var3;
            if (!var2) {
               if (!var3) {
                  class142.field2268.method5224(arg1, 109);
                  return;
               }

               return;
            }
         } else {
            var10000 = class458.method3545(2259, arg1.method1824(110), var4.method1824(arg0 ^ 18749));
         }

         do {
            while(true) {
               if (var10000) {
                  var3 = true;
                  class141.method1412(false, var4, arg1);
                  if (!var2) {
                     var10000 = var3;
                     break;
                  }

                  var4 = (class211)class142.field2268.method5227(-17856);
               } else {
                  var4 = (class211)class142.field2268.method5227(-17856);
               }

               if (var4 == null) {
                  var10000 = var3;
                  if (!var2) {
                     if (!var3) {
                        class142.field2268.method5224(arg1, 109);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = class458.method3545(2259, arg1.method1824(110), var4.method1824(arg0 ^ 18749));
               }
            }
         } while(var2);

         if (!var3) {
            class142.field2268.method5224(arg1, 109);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6759[2] + arg0 + ',' + (arg1 != null ? field6759[1] : field6759[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3578(int arg0) {
      try {
         field6756 = null;
         if (arg0 != -58) {
            method3576(96, 15L, 26, 10);
         }

         field6757 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6759[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3579(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3580(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
