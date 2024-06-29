import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class500 {
   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7659 = new String[]{method3883(method3882("@E\u0012\\$")), method3883(method3882("@E\u0012[$")), method3883(method3882("@E\u0012Z$")), method3883(method3882("@E\u0012Y$"))};
   @OriginalMember(
      owner = "client!id",
      name = "c",
      descriptor = "I"
   )
   public static int field7655;
   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "I"
   )
   public static int field7656;
   @OriginalMember(
      owner = "client!id",
      name = "d",
      descriptor = "I"
   )
   public static int field7658;
   @OriginalMember(
      owner = "client!id",
      name = "b",
      descriptor = "Lrr;"
   )
   public static class678 field7657;

   @OriginalMember(
      owner = "client!id",
      name = "c",
      descriptor = "(I)V",
      line = 5
   )
   public static final void method3878(int arg0) {
      try {
         ++field7655;
         if (arg0 != -28039) {
            field7657 = null;
         }

         class86.field1259.method3149(-73);
         class77.field1017.method3696(arg0 + 28098);
         class553.field8273.method3696(arg0 ^ 28114);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7659[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "b",
      descriptor = "(I)V",
      line = 23
   )
   public static void method3879(int arg0) {
      try {
         field7657 = null;
         if (arg0 != 2) {
            field7657 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7659[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(JI)V",
      line = 33
   )
   public static final void method3880(long arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field7658;
         if (arg1 == -1) {
            int var4 = class222.field3343 + class476.field7251.field1505;
            int var5 = class651.field9393 + class476.field7251.field1494;
            if (-var4 + class674.field10031 < -2000 || ~(-var4 + class674.field10031) < -2001 || ~(-var5 + class149.field2262) > 1999 || class149.field2262 - var5 > 2000) {
               class149.field2262 = var5;
               class674.field10031 = var4;
            }

            if (~class674.field10031 != ~var4) {
               int var7;
               label95: {
                  int var6 = -class674.field10031 + var4;
                  var7 = (int)((long)var6 * arg0 / 320L);
                  if (~var6 < -1) {
                     if (~var7 == -1) {
                        var7 = 1;
                        if (!var3) {
                           break label95;
                        }
                     }

                     if (~var7 >= ~var6) {
                        break label95;
                     }

                     var7 = var6;
                     if (!var3) {
                        break label95;
                     }
                  }

                  if (var7 == 0) {
                     var7 = -1;
                     if (!var3) {
                        break label95;
                     }
                  }

                  if (var7 < var6) {
                     var7 = var6;
                  }
               }

               class674.field10031 += var7;
            }

            class417.field6456 += (float)arg0 * class730.field10902 / 6.0F;
            if (~class149.field2262 != ~var5) {
               int var9;
               label97: {
                  int var8 = -class149.field2262 + var5;
                  var9 = (int)((long)var8 * arg0 / 320L);
                  if (var8 > 0) {
                     if (~var9 == -1) {
                        var9 = 1;
                        if (!var3) {
                           break label97;
                        }
                     }

                     if (var9 <= var8) {
                        break label97;
                     }

                     var9 = var8;
                     if (!var3) {
                        break label97;
                     }
                  }

                  if (~var9 != -1) {
                     if (~var9 <= ~var8) {
                        break label97;
                     }

                     var9 = var8;
                     if (!var3) {
                        break label97;
                     }
                  }

                  var9 = -1;
               }

               class149.field2262 += var9;
            }

            class357.field5520 += (float)arg0 * class156.field2327 / 6.0F;
            class109.method1042(19795);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field7659[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!id",
      name = "a",
      descriptor = "(I)V",
      line = 120
   )
   public static final void method3881(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3882(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!id",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3883(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
