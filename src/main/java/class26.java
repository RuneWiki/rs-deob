import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class26 {
   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field414 = new String[]{method261(method260("@\u0013@O\u001a")), method261(method260("F\u0002Tb@")), method261(method260("@\u0005\u0002b")), method261(method260("U^@ O")), method261(method260("@\u0013@L\u001a")), method261(method260("@\u0013@J\u001a"))};
   @OriginalMember(
      owner = "client!nc",
      name = "c",
      descriptor = "Lek;"
   )
   public static class536 field410 = new class536(84, 8);
   @OriginalMember(
      owner = "client!nc",
      name = "e",
      descriptor = "I"
   )
   public static int field412 = 0;
   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "I"
   )
   public static int field413 = 0;
   @OriginalMember(
      owner = "client!nc",
      name = "d",
      descriptor = "I"
   )
   public static int field409;
   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "I"
   )
   public static int field411;

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method256(int arg0, int arg1) {
      return class17.field202 != null ? class17.field202[arg0][arg1] & 65535 : 0;
   }

   @OriginalMember(
      owner = "client!nc",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method257(byte arg0) {
      boolean var1 = client.field4360;

      try {
         ++field411;
         class699 var2 = (class699)class148.field1935.method328(1745388291);
         if (var1) {
            if (var2.field10229) {
               var2.field10229 = false;
               if (var1) {
                  class342.method2509(var2.field10227, (byte)56);
               }
            } else {
               class342.method2509(var2.field10227, (byte)56);
            }

            var2 = (class699)class148.field1935.method325(-4629);
         }

         while(true) {
            while(var2 != null) {
               if (var2.field10229) {
                  var2.field10229 = false;
                  if (var1) {
                     class342.method2509(var2.field10227, (byte)56);
                  }
               } else {
                  class342.method2509(var2.field10227, (byte)56);
               }

               var2 = (class699)class148.field1935.method325(-4629);
            }

            if (!var1) {
               if (arg0 < 47) {
                  field412 = 17;
                  return;
               }

               return;
            }

            class342.method2509(arg0, (byte)47);
            var2 = (class699)class148.field1935.method325(-4629);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field414[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(Lbda;ZI)Z"
   )
   public static final boolean method258(class534 arg0, boolean arg1, int arg2) {
      try {
         ++field409;
         int var3 = arg0.method3844(2, 0);
         if (var3 == 0) {
            if (arg0.method3844(1, 0) != 0) {
               method258(arg0, arg1, arg2);
            }

            int var4 = arg0.method3844(6, 0);
            int var5 = arg0.method3844(6, 0);
            boolean var6 = arg0.method3844(1, 0) == 1;
            if (var6) {
               class266.field3682[class753.field11133++] = arg2;
            }

            if (class380.field5483[arg2] != null) {
               throw new RuntimeException(field414[1]);
            } else {
               class71 var7 = class430.field6153[arg2];
               class121 var8 = class380.field5483[arg2] = new class121();
               var8.field3862 = arg2;
               if (class483.field6906[arg2] != null) {
                  var8.method974((byte)-119, class483.field6906[arg2]);
               }

               var8.method2122(-62, true, var7.field874);
               var8.field3857 = var7.field870;
               int var9 = var7.field872;
               int var10 = var9 >> 28;
               int var11 = (4192772 & var9) >> 14;
               int var12 = var9 & 255;
               int var13 = (var11 << 6) + var4 - class672.field9740;
               var8.field1535 = var7.field868;
               var8.field1555 = var7.field875;
               int var14 = (var12 << 6) + var5 + -class533.field7595;
               var8.field3889[0] = class187.field2660[arg2];
               var8.field10701 = var8.field10702 = (byte)var10;
               if (class437.method3224(var14, true, var13)) {
                  ++var8.field10702;
               }

               var8.method968(var13, (byte)-122, var14);
               var8.field1574 = false;
               class430.field6153[arg2] = null;
               return true;
            }
         } else if (var3 == 1) {
            int var15 = arg0.method3844(2, 0);
            int var16 = class430.field6153[arg2].field872;
            class430.field6153[arg2].field872 = (805306368 & (var16 >> 28) + var15 << 28) - -(var16 & 268435455);
            return false;
         } else if (~var3 == -3) {
            int var17 = arg0.method3844(5, 0);
            int var18 = var17 >> 3;
            int var19 = 7 & var17;
            int var20 = class430.field6153[arg2].field872;
            int var21 = 3 & (var20 >> 28) + var18;
            int var22 = (var20 & 4193191) >> 14;
            int var23 = 255 & var20;
            if (var19 == 0) {
               --var22;
               --var23;
            }

            if (var19 == 1) {
               --var23;
            }

            if (~var19 == -3) {
               --var23;
               ++var22;
            }

            if (~var19 == -4) {
               --var22;
            }

            if (var19 == 4) {
               ++var22;
            }

            if (var19 == 5) {
               --var22;
               ++var23;
            }

            if (~var19 == -7) {
               ++var23;
            }

            if (~var19 == -8) {
               ++var23;
               ++var22;
            }

            class430.field6153[arg2].field872 = (var21 << 28) + (var22 << 14) + var23;
            return false;
         } else {
            int var24 = arg0.method3844(18, 0);
            if (arg1) {
               return true;
            } else {
               int var25 = var24 >> 16;
               int var26 = (65453 & var24) >> 8;
               int var27 = var24 & 255;
               int var28 = class430.field6153[arg2].field872;
               int var29 = 3 & (var28 >> 28) - -var25;
               int var30 = 255 & (var28 >> 14) + var26;
               int var31 = 255 & var28 - -var27;
               class430.field6153[arg2].field872 = (var29 << 28) + (var30 << 14) + var31;
               return false;
            }
         }
      } catch (RuntimeException var33) {
         throw class237.method1823(var33, field414[0] + (arg0 != null ? field414[3] : field414[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method259(byte arg0) {
      try {
         field410 = null;
         if (arg0 >= -8) {
            field413 = -113;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field414[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method260(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method261(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
