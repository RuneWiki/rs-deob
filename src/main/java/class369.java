import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class369 {
   @OriginalMember(
      owner = "client!fda",
      name = "i",
      descriptor = "I"
   )
   public int field5734;
   @OriginalMember(
      owner = "client!fda",
      name = "j",
      descriptor = "I"
   )
   public int field5731;
   @OriginalMember(
      owner = "client!fda",
      name = "b",
      descriptor = "I"
   )
   public int field5732;
   @OriginalMember(
      owner = "client!fda",
      name = "d",
      descriptor = "I"
   )
   public int field5741;
   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5742 = new String[]{method3026(method3025("~\u001d,\f=q\u0017$V?0")), method3026(method3025("~\u001d,\fD0")), method3026(method3025("v\f!N")), method3026(method3025("cWc\f|")), method3026(method3025("~\u001d,\f@0")), method3026(method3025("~\u001d,\fB0")), method3026(method3025("~\u001d,\fG0")), method3026(method3025("~\u001d,\fE0")), method3026(method3025("~\u001d,\fC0"))};
   @OriginalMember(
      owner = "client!fda",
      name = "e",
      descriptor = "Lhr;"
   )
   public static class666 field5739 = new class666();
   @OriginalMember(
      owner = "client!fda",
      name = "g",
      descriptor = "I"
   )
   public static int field5733;
   @OriginalMember(
      owner = "client!fda",
      name = "h",
      descriptor = "I"
   )
   public static int field5735;
   @OriginalMember(
      owner = "client!fda",
      name = "c",
      descriptor = "I"
   )
   public static int field5736;
   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "I"
   )
   public static int field5737;
   @OriginalMember(
      owner = "client!fda",
      name = "f",
      descriptor = "I"
   )
   public static int field5738;
   @OriginalMember(
      owner = "client!fda",
      name = "k",
      descriptor = "I"
   )
   public static int field5740;

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(IILjava/lang/String;)V",
      line = 3
   )
   public static final void method3019(int arg0, int arg1, String arg2) {
      try {
         ++class214.field3247;
         ++field5737;
         class29 var3 = class578.method4332((byte)-32);
         if (arg0 == 0) {
            class577 var4 = class218.method1888(class276.field4405, 108, var3.field361);
            var4.field8531.method2864(-26110, class714.method5292((byte)-117, arg2) + 1);
            var4.field8531.method2862(arg2, true);
            var4.field8531.method2895(arg1, (byte)-5);
            var3.method211(var4, 117);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5742[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5742[3] : field5742[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)I",
      line = 24
   )
   public static final int method3020(boolean arg0, String arg1, String arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         ++field5738;
         if (!arg0) {
            method3023(-36);
         }

         int var5 = arg1.length();
         int var6 = arg2.length();
         int var7 = 0;
         int var8 = 0;
         char var9 = 0;
         char var10 = 0;

         int var10000;
         label124:
         while(-var9 + var7 < var5 || var6 > -var10 + var8) {
            var10000 = -var9 + var7;
            int var10001 = var5;

            while(var10000 < var10001) {
               if (var8 - var10 >= var6) {
                  return 1;
               }

               char var11;
               label114: {
                  if (var9 == 0) {
                     var11 = arg1.charAt(var7++);
                     if (!var4) {
                        break label114;
                     }
                  }

                  var11 = var9;
                  boolean var12 = false;
               }

               char var13;
               label109: {
                  if (~var10 == -1) {
                     var13 = arg2.charAt(var8++);
                     if (!var4) {
                        break label109;
                     }
                  }

                  var13 = var10;
                  boolean var14 = false;
               }

               var9 = class304.method2542(var11, 11843);
               var10 = class304.method2542(var13, 11843);
               char var15 = class632.method4623(arg3, (byte)34, var11);
               char var16 = class632.method4623(arg3, (byte)57, var13);
               if (var15 == var16) {
                  continue label124;
               }

               var10000 = Character.toUpperCase(var15);
               var10001 = Character.toUpperCase(var16);
               if (!var4) {
                  if (var10000 != var10001) {
                     char var17 = Character.toLowerCase(var15);
                     char var18 = Character.toLowerCase(var16);
                     if (var17 != var18) {
                        return class103.method1002(var17, (byte)-36, arg3) + -class103.method1002(var18, (byte)-32, arg3);
                     }
                  }
                  continue label124;
               }
            }

            return -1;
         }

         int var19 = Math.min(var5, var6);
         int var20 = 0;
         int var21;
         int var22;
         char var23;
         char var24;
         char var25;
         char var26;
         if (var4) {
            if (~arg3 == -3) {
               var21 = -1 - var20 + var5;
               var22 = -var20 + var6 + -1;
               if (var4) {
                  var22 = var20;
                  var21 = var20;
               }
            } else {
               var22 = var20;
               var21 = var20;
            }

            var23 = arg1.charAt(var21);
            var24 = arg2.charAt(var22);
            if (~var23 != ~var24 && Character.toUpperCase(var23) != Character.toUpperCase(var24)) {
               var25 = Character.toLowerCase(var23);
               var26 = Character.toLowerCase(var24);
               if (var25 != var26) {
                  return class103.method1002(var25, (byte)-93, arg3) - class103.method1002(var26, (byte)-108, arg3);
               }
            }

            ++var20;
         }

         while(true) {
            byte var34;
            if (~var20 <= ~var19) {
               int var27 = -var6 + var5;
               var10000 = ~var27;
               var34 = -1;
               if (!var4) {
                  if (var10000 != -1) {
                     return var27;
                  }

                  int var28 = 0;
                  char var33;
                  if (var4) {
                     var33 = arg1.charAt(var28);
                  } else if (var19 <= var28) {
                     var33 = 0;
                     if (!var4) {
                        return 0;
                     }
                  } else {
                     var33 = arg1.charAt(var28);
                  }

                  while(true) {
                     char var29 = var33;
                     char var30 = arg2.charAt(var28);
                     if (~var29 != ~var30) {
                        return class103.method1002(var29, (byte)-65, arg3) + -class103.method1002(var30, (byte)97, arg3);
                     }

                     ++var28;
                     if (var19 <= var28) {
                        var33 = 0;
                        if (!var4) {
                           return 0;
                        }
                     } else {
                        var33 = arg1.charAt(var28);
                     }
                  }
               }
            } else {
               var10000 = ~arg3;
               var34 = -3;
            }

            if (var10000 == var34) {
               var21 = -1 - var20 + var5;
               var22 = -var20 + var6 + -1;
               if (var4) {
                  var22 = var20;
                  var21 = var20;
               }
            } else {
               var22 = var20;
               var21 = var20;
            }

            var23 = arg1.charAt(var21);
            var24 = arg2.charAt(var22);
            if (~var23 != ~var24 && Character.toUpperCase(var23) != Character.toUpperCase(var24)) {
               var25 = Character.toLowerCase(var23);
               var26 = Character.toLowerCase(var24);
               if (var25 != var26) {
                  return class103.method1002(var25, (byte)-93, arg3) - class103.method1002(var26, (byte)-108, arg3);
               }
            }

            ++var20;
         }
      } catch (RuntimeException var32) {
         throw class482.method3757(var32, field5742[5] + arg0 + ',' + (arg1 != null ? field5742[3] : field5742[2]) + ',' + (arg2 != null ? field5742[3] : field5742[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(B)V",
      line = 150
   )
   public static void method3021(byte arg0) {
      try {
         field5739 = null;
         if (arg0 != -60) {
            field5740 = 61;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5742[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(IIIIIZI)V",
      line = 161
   )
   public static final void method3022(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
      try {
         class148.field2231 = arg0;
         ++field5736;
         class754.field11172 = arg2;
         class666.field9975 = arg4;
         class621.field9036 = arg6;
         class532.field8068 = arg1;
         if (arg5 && class532.field8068 >= 100) {
            class691.field10259 = class621.field9036 * 512 + 256;
            class401.field6288 = class754.field11172 * 512 + 256;
            class653.field9780 = class477.method3711(class464.field7054, class401.field6288, (byte)0, class691.field10259) - class666.field9975;
         }

         class572.field8464 = -1;
         class697.field10346 = -1;
         class648.field9340 = 2;
         if (arg3 < 37) {
            method3019(101, 33, (String)null);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field5742[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(I)Z",
      line = 188
   )
   public static final boolean method3023(int arg0) {
      try {
         ++field5735;

         try {
            class746 var1 = new class746();
            byte[] var2 = var1.method5483(-4, class316.field4886);
            class707.method5217(false, var2);
            if (arg0 != 256) {
               field5740 = -78;
            }

            return true;
         } catch (Exception var4) {
            return false;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5742[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(II)Lfda;",
      line = 212
   )
   public final class369 method3024(int arg0, int arg1) {
      try {
         ++field5733;
         return arg0 != 0 ? null : new class369(this.field5732, arg1, this.field5734, this.field5741);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field5742[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "<init>",
      descriptor = "(IIII)V",
      line = 231
   )
   public class369(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field5734 = arg2;
         this.field5731 = arg1;
         this.field5732 = arg0;
         this.field5741 = arg3;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5742[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3025(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3026(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
