import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class115 {
   @OriginalMember(
      owner = "client!so",
      name = "g",
      descriptor = "I"
   )
   public int field1517;
   @OriginalMember(
      owner = "client!so",
      name = "b",
      descriptor = "I"
   )
   public int field1518;
   @OriginalMember(
      owner = "client!so",
      name = "e",
      descriptor = "I"
   )
   public int field1522;
   @OriginalMember(
      owner = "client!so",
      name = "h",
      descriptor = "I"
   )
   public int field1514;
   @OriginalMember(
      owner = "client!so",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1524 = new String[]{method1029(method1028("\u0007?\u0013\u0010\u007f")), method1029(method1028("\u0007?\u0013\u0016\u007f")), method1029(method1028("\u0007?\u0013\u0015\u007f")), method1029(method1028("\u0007?\u0013h>\u001a9Ij\u007f")), method1029(method1028("\u0007?\u0013\u0011\u007f"))};
   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "Lse;"
   )
   public static class6 field1516 = new class6(65, -1);
   @OriginalMember(
      owner = "client!so",
      name = "i",
      descriptor = "Laka;"
   )
   public static class418 field1521 = new class418(18, 0);
   @OriginalMember(
      owner = "client!so",
      name = "c",
      descriptor = "F"
   )
   public static float field1523;
   @OriginalMember(
      owner = "client!so",
      name = "d",
      descriptor = "I"
   )
   public static int field1515;
   @OriginalMember(
      owner = "client!so",
      name = "f",
      descriptor = "I"
   )
   public static int field1519;
   @OriginalMember(
      owner = "client!so",
      name = "j",
      descriptor = "I"
   )
   public static int field1520;

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(II)Lso;"
   )
   public final class115 method1023(int arg0, int arg1) {
      try {
         ++field1515;
         int var3 = -35 % ((40 - arg1) / 38);
         return new class115(this.field1518, arg0, this.field1514, this.field1517);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1524[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1024(byte arg0) {
      try {
         field1516 = null;
         int var1 = 73 % ((arg0 - 23) / 61);
         field1521 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1524[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(IIIIBIIII)V"
   )
   public static final void method1025(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field1481;

      try {
         ++field1520;
         if (!class792.method5717((byte)-53, arg5)) {
            if (~arg6 != 0) {
               class485.field6750[arg6] = true;
            } else {
               int var10 = 0;
               if (var9) {
                  class485.field6750[var10] = true;
                  ++var10;
               }

               while(true) {
                  while(var10 < 100) {
                     class485.field6750[var10] = true;
                     ++var10;
                  }

                  if (!var9) {
                     return;
                  }

                  ++var10;
               }
            }
         } else {
            int var11 = 0;
            if (arg4 >= -36) {
               method1025(86, 41, -114, 104, (byte)65, -77, 34, 31, 90);
            }

            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            if (class28.field416) {
               var13 = class692.field10163;
               var12 = class231.field2877;
               var11 = class476.field6637;
               var15 = class270.field3443;
               var14 = class584.field8623;
               class270.field3443 = 1;
            }

            label91: {
               if (class778.field11337[arg5] != null) {
                  class427.method3308(class778.field11337[arg5], arg6, ~arg6 > -1, -1, arg0, arg1, arg7, -5230, arg8, arg2, arg3);
                  if (!var9) {
                     break label91;
                  }
               }

               class427.method3308(class419.field5722[arg5], arg6, ~arg6 > -1, -1, arg0, arg1, arg7, -5230, arg8, arg2, arg3);
            }

            if (class28.field416) {
               if (~arg6 <= -1 && class270.field3443 == 2) {
                  class762.method5522(class692.field10163, class231.field2877, class584.field8623, -120, class476.field6637);
               }

               class476.field6637 = var11;
               class692.field10163 = var13;
               class584.field8623 = var14;
               class270.field3443 = var15;
               class231.field2877 = var12;
            }
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field1524[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method1026(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var6 = arg0 & 3;
         ++field1519;
         if (~var6 == -1) {
            return arg3;
         } else if (~var6 == -2) {
            return -arg2 + 7;
         } else {
            if (arg1 != 17616) {
               field1516 = null;
            }

            return var6 == 2 ? 7 - arg3 : arg2;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1524[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "a",
      descriptor = "()V"
   )
   public static final void method1027() {
      for(int var0 = class406.field5574; var0 < class174.field2251; ++var0) {
         for(int var1 = 0; var1 < class137.field1743; ++var1) {
            for(int var2 = 0; var2 < class181.field2297; ++var2) {
               class731 var3 = class548.field8080[var0][var1][var2];
               if (var3 != null) {
                  class30 var4 = var3.field10656;
                  class30 var5 = var3.field10642;
                  if (var4 != null && var4.method178(-1)) {
                     class75.method719(var4, var0, var1, var2, 1, 1);
                     if (var5 != null && var5.method178(-1)) {
                        class75.method719(var5, var0, var1, var2, 1, 1);
                        var5.method183(class158.field2032, false, false, var4, 0, 0, 0);
                        var5.method190(0);
                     }

                     var4.method190(0);
                  }

                  for(class131 var6 = var3.field10654; var6 != null; var6 = var6.field1670) {
                     class680 var8 = var6.field1676;
                     if (var8 != null && var8.method178(-1)) {
                        class75.method719(var8, var0, var1, var2, var8.field10015 - var8.field10010 + 1, var8.field10020 - var8.field10011 + 1);
                        var8.method190(0);
                     }
                  }

                  class403 var7 = var3.field10649;
                  if (var7 != null && var7.method178(-1)) {
                     class488.method3703(var7, var0, var1, var2);
                     var7.method190(0);
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!so",
      name = "<init>",
      descriptor = "(IIII)V"
   )
   public class115(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field1517 = arg3;
         this.field1518 = arg0;
         this.field1522 = arg1;
         this.field1514 = arg2;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1524[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!so",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1028(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!so",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1029(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
