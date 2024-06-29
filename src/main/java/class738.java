import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eja")
public class class738 {
   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10974 = new String[]{method5425(method5424("xT]OE5")), method5425(method5424("sKP\r")), method5425(method5424("xT]OB5")), method5425(method5424("f\u0010\u0012O{")), method5425(method5424("xT]OD5"))};
   @OriginalMember(
      owner = "client!eja",
      name = "d",
      descriptor = "Lnaa;"
   )
   public static class113 field10967 = new class113(13, 8);
   @OriginalMember(
      owner = "client!eja",
      name = "e",
      descriptor = "I"
   )
   public static int field10968 = 1405;
   @OriginalMember(
      owner = "client!eja",
      name = "f",
      descriptor = "I"
   )
   public static int field10973 = 0;
   @OriginalMember(
      owner = "client!eja",
      name = "g",
      descriptor = "I"
   )
   public int field10965;
   @OriginalMember(
      owner = "client!eja",
      name = "b",
      descriptor = "I"
   )
   public static int field10966;
   @OriginalMember(
      owner = "client!eja",
      name = "h",
      descriptor = "I"
   )
   public static int field10969;
   @OriginalMember(
      owner = "client!eja",
      name = "i",
      descriptor = "I"
   )
   public int field10970;
   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "I"
   )
   public int field10971;
   @OriginalMember(
      owner = "client!eja",
      name = "j",
      descriptor = "I"
   )
   public int field10972;
   @OriginalMember(
      owner = "client!eja",
      name = "c",
      descriptor = "Lega;"
   )
   public static class486 field10964;

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(Z)V",
      line = 4
   )
   public static void method5420(boolean arg0) {
      try {
         field10964 = null;
         if (!arg0) {
            method5421((class109)null, true, true);
         }

         field10967 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10974[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(Lbaa;ZZ)V",
      line = 16
   )
   public static final void method5421(class109 arg0, boolean arg1, boolean arg2) {
      arg0.field1509 = arg2;
      if (class116.field1566) {
         if (arg1) {
            class659.field9842[class659.field9842.length - 1].method3538(arg0, 117);
         } else {
            int var3 = class303.method2538(arg0.field1507);
            int var4 = class786.field11532[2] * arg0.method239(41) / arg0.field1498;
            int var5 = class303.method2538(arg0.field1507 - var4);
            int var6 = class303.method2538(arg0.field1507 + var4);
            if (var5 == var6) {
               class659.field9842[var3].method3538(arg0, 92);
            } else if (var6 - var5 == 1) {
               class659.field9842[class571.field8459 + var5].method3538(arg0, 91);
            } else {
               class659.field9842[class659.field9842.length - 1].method3538(arg0, 101);
            }
         }
      } else {
         class366.method2977(arg0, class170.field2599);
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "(II[BIIII[BI)V",
      line = 50
   )
   public static final void method5422(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
      boolean var9 = client.field1786;

      try {
         ++field10969;
         int var10 = -(arg6 >> 2);
         int var16 = -(arg6 & 3);
         int var11 = -arg8;
         if (arg5 >= -67) {
            method5420(false);
            if (!var9 && ~var11 <= -1) {
               return;
            }
         } else if (~var11 <= -1) {
            return;
         }

         label92:
         do {
            int var12 = var10;
            int var10001;
            if (var9) {
               var10001 = arg1++;
               arg2[var10001] = (byte)(arg2[var10001] + -arg7[arg3++]);
               int var17 = arg1++;
               arg2[var17] = (byte)(arg2[var17] + -arg7[arg3++]);
               int var18 = arg1++;
               arg2[var18] = (byte)(arg2[var18] + -arg7[arg3++]);
               int var19 = arg1++;
               arg2[var19] = (byte)(arg2[var19] + -arg7[arg3++]);
               var12 = var10 + 1;
            }

            while(true) {
               while(var12 < 0) {
                  var10001 = arg1++;
                  arg2[var10001] = (byte)(arg2[var10001] + -arg7[arg3++]);
                  var10001 = arg1++;
                  arg2[var10001] = (byte)(arg2[var10001] + -arg7[arg3++]);
                  var10001 = arg1++;
                  arg2[var10001] = (byte)(arg2[var10001] + -arg7[arg3++]);
                  var10001 = arg1++;
                  arg2[var10001] = (byte)(arg2[var10001] + -arg7[arg3++]);
                  ++var12;
               }

               int var13 = var16;
               if (!var9) {
                  if (var9) {
                     var10001 = arg1++;
                     arg2[var10001] = (byte)(arg2[var10001] + -arg7[arg3++]);
                     var13 = var16 + 1;
                  }

                  while(true) {
                     while(var13 < 0) {
                        var10001 = arg1++;
                        arg2[var10001] = (byte)(arg2[var10001] + -arg7[arg3++]);
                        ++var13;
                     }

                     arg1 += arg0;
                     arg3 += arg4;
                     if (!var9) {
                        ++var11;
                        continue label92;
                     }

                     ++var13;
                  }
               }

               ++var12;
            }
         } while(~var11 > -1);

      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field10974[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10974[3] : field10974[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field10974[3] : field10974[1]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "a",
      descriptor = "([BIII)[B",
      line = 95
   )
   public static final byte[] method5423(byte[] arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         byte[] var5;
         label43: {
            ++field10966;
            if (~arg3 >= -1) {
               var5 = arg0;
               if (!var4) {
                  break label43;
               }
            }

            var5 = new byte[arg1];
            int var6 = 0;
            if (var4 || arg1 > var6) {
               do {
                  var5[var6] = arg0[arg3 + var6];
                  ++var6;
               } while(arg1 > var6);
            }
         }

         if (arg2 != -3436) {
            return null;
         } else {
            class572 var7 = new class572();
            var7.method4302(true);
            var7.method4301((long)(arg1 * 8), 8, var5);
            byte[] var8 = new byte[64];
            var7.method4304(5, 0, var8);
            return var8;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field10974[4] + (arg0 != null ? field10974[3] : field10974[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5424(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5425(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 60;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
