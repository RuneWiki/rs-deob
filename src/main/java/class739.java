import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class739 implements class261 {
   @OriginalMember(
      owner = "client!ge",
      name = "g",
      descriptor = "Lri;"
   )
   private class123 field10780;
   @OriginalMember(
      owner = "client!ge",
      name = "i",
      descriptor = "Lbm;"
   )
   private class124 field10784;
   @OriginalMember(
      owner = "client!ge",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10789 = new String[]{method5364(method5363("\u0010\u0002sZ")), method5364(method5363("\u0019\u00121\nz\u0010\u001ek\b;")), method5364(method5363("\u0005Y1\u0018n")), method5364(method5363("\u0019\u00121t;")), method5364(method5363("\u0019\u00121r;")), method5364(method5363("\u0019\u00121~;")), method5364(method5363("B\u001bk\b")), method5364(method5363("B\u0010k\b")), method5364(method5363("\u0019\u00121u;")), method5364(method5363("\u0019\u00121s;")), method5364(method5363("\u0019\u00121w;"))};
   @OriginalMember(
      owner = "client!ge",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field10781 = new int[6];
   @OriginalMember(
      owner = "client!ge",
      name = "h",
      descriptor = "I"
   )
   public static int field10783;
   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "I"
   )
   public static int field10785;
   @OriginalMember(
      owner = "client!ge",
      name = "f",
      descriptor = "I"
   )
   public static int field10786;
   @OriginalMember(
      owner = "client!ge",
      name = "b",
      descriptor = "I"
   )
   public static int field10787;
   @OriginalMember(
      owner = "client!ge",
      name = "d",
      descriptor = "I"
   )
   public static int field10788;
   @OriginalMember(
      owner = "client!ge",
      name = "c",
      descriptor = "[Lbg;"
   )
   public static class492[] field10782;

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method861(byte arg0, boolean arg1) {
      try {
         int var3 = -17 / ((-31 - arg0) / 44);
         ++field10785;
         class760 var4 = this.field10784.method999(this.field10780.field1597, -1);
         if (var4 != null) {
            int var5 = this.field10780.field1605.method1384(this.field10780.field1591, (byte)-127, class87.field1142) + this.field10780.field1600;
            int var6 = this.field10780.field1596.method1414(this.field10780.field1592, 104, class60.field743) + this.field10780.field1593;
            if (this.field10780.field1590) {
               class383.field5543.method608(var5, var6, this.field10780.field1591, this.field10780.field1592, this.field10780.field1601, 0);
            }

            int var7 = var6 + this.method5360(var6, class455.field6465, (byte)-122, var4.field11236, var5, 5) * 12;
            int var12 = var7 + 8;
            if (this.field10780.field1590) {
               class383.field5543.method589(var5, var12, this.field10780.field1591 + var5 + -1, var12, this.field10780.field1601, 0);
            }

            var7 = var12 + 1;
            int var8 = var7 + this.method5360(var7, class455.field6465, (byte)-113, var4.field11235, var5, 5) * 12;
            int var13 = var8 + 5;
            int var10000 = var13 + this.method5360(var13, class455.field6465, (byte)-117, var4.field11237, var5, 5) * 12;
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field10789[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method862(int arg0) {
      try {
         ++field10787;
         if (arg0 != -23681) {
            this.field10780 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10789[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(ILda;BLjava/lang/String;II)I"
   )
   private final int method5360(int arg0, class67 arg1, byte arg2, String arg3, int arg4, int arg5) {
      try {
         ++field10783;
         if (arg2 >= -109) {
            this.field10780 = null;
         }

         return arg1.method626(0, arg0 + arg5, -(arg5 * 2) + this.field10780.field1591, -(arg5 * 2) + this.field10780.field1592, 0, (class515)null, 0, (int[])null, this.field10780.field1604, arg4 + arg5, 0, this.field10780.field1603, 0, 0, (class492[])null, arg3);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field10789[9] + arg0 + ',' + (arg1 != null ? field10789[2] : field10789[0]) + ',' + arg2 + ',' + (arg3 != null ? field10789[2] : field10789[0]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method860(int arg0) {
      try {
         if (arg0 != 9201) {
            return true;
         } else {
            ++field10788;
            return this.field10784.method1000((byte)122);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10789[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method5361(int arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         ++field10786;
         int var3 = arg1.length();
         int var4 = 0;
         int var5 = 0;
         if (var2) {
            char var6 = arg1.charAt(var5);
            if (var6 != '<') {
               if (~var6 == -63) {
                  var4 += 3;
               }
            } else {
               var4 += 3;
            }

            ++var5;
         }

         while(true) {
            int var10000;
            if (var5 >= var3) {
               var10000 = arg0;
               if (!var2) {
                  if (arg0 <= 19) {
                     field10782 = null;
                  }

                  StringBuffer var7 = new StringBuffer(var3 + var4);
                  int var8 = 0;
                  String var13;
                  if (var2) {
                     var13 = arg1;
                  } else if (~var8 <= ~var3) {
                     var13 = var7.toString();
                     if (!var2) {
                        return var13;
                     }
                  } else {
                     var13 = arg1;
                  }

                  while(true) {
                     char var9 = var13.charAt(var8);
                     if (var9 != '<') {
                        if (~var9 == -63) {
                           var7.append(field10789[7]);
                           if (var2) {
                              var7.append(var9);
                              if (var2) {
                                 var7.append(field10789[6]);
                                 ++var8;
                              } else {
                                 ++var8;
                              }
                           } else {
                              ++var8;
                           }
                        } else {
                           var7.append(var9);
                           if (var2) {
                              var7.append(field10789[6]);
                              ++var8;
                           } else {
                              ++var8;
                           }
                        }
                     } else {
                        var7.append(field10789[6]);
                        ++var8;
                     }

                     if (~var8 <= ~var3) {
                        var13 = var7.toString();
                        if (!var2) {
                           return var13;
                        }
                     } else {
                        var13 = arg1;
                     }
                  }
               }
            } else {
               var10000 = arg1.charAt(var5);
            }

            int var12 = var10000;
            if (var12 != 60) {
               if (~var12 == -63) {
                  var4 += 3;
               }
            } else {
               var4 += 3;
            }

            ++var5;
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field10789[8] + arg0 + ',' + (arg1 != null ? field10789[2] : field10789[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5362(int arg0) {
      try {
         field10781 = null;
         if (arg0 != 0) {
            method5362(-107);
         }

         field10782 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10789[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "<init>",
      descriptor = "(Lbm;Lri;)V"
   )
   public class739(class124 arg0, class123 arg1) {
      try {
         this.field10780 = arg1;
         this.field10784 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10789[1] + (arg0 != null ? field10789[2] : field10789[0]) + ',' + (arg1 != null ? field10789[2] : field10789[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5363(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5364(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
