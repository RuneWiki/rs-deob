import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class592 extends class70 {
   @OriginalMember(
      owner = "client!ig",
      name = "M",
      descriptor = "[I"
   )
   private int[] field8716 = new int[3];
   @OriginalMember(
      owner = "client!ig",
      name = "P",
      descriptor = "I"
   )
   private int field8717 = 409;
   @OriginalMember(
      owner = "client!ig",
      name = "G",
      descriptor = "I"
   )
   private int field8712 = 4096;
   @OriginalMember(
      owner = "client!ig",
      name = "O",
      descriptor = "I"
   )
   private int field8718 = 4096;
   @OriginalMember(
      owner = "client!ig",
      name = "J",
      descriptor = "I"
   )
   private int field8720 = 4096;
   @OriginalMember(
      owner = "client!ig",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8725 = new String[]{method4411(method4410("\u0018[\u000e\f\u0017")), method4411(method4410("\u001fIL!")), method4411(method4410("\n\u0012\u000ecB")), method4411(method4410("\u0018[\u000e\u0007\u0017")), method4411(method4410("\u0018[\u000e\u000b\u0017")), method4411(method4410("\u0018[\u000e\t\u0017")), method4411(method4410("\u0018[\u000e\u0005\u0017"))};
   @OriginalMember(
      owner = "client!ig",
      name = "Q",
      descriptor = "Let;"
   )
   public static class389 field8715 = new class389(512);
   @OriginalMember(
      owner = "client!ig",
      name = "H",
      descriptor = "Lnm;"
   )
   public static class480 field8722 = new class480(0, 0);
   @OriginalMember(
      owner = "client!ig",
      name = "R",
      descriptor = "I"
   )
   public static int field8713;
   @OriginalMember(
      owner = "client!ig",
      name = "N",
      descriptor = "I"
   )
   public static int field8714;
   @OriginalMember(
      owner = "client!ig",
      name = "I",
      descriptor = "I"
   )
   public static int field8719;
   @OriginalMember(
      owner = "client!ig",
      name = "L",
      descriptor = "I"
   )
   public static int field8723;
   @OriginalMember(
      owner = "client!ig",
      name = "K",
      descriptor = "Ljq;"
   )
   public static class672 field8724;
   @OriginalMember(
      owner = "client!ig",
      name = "F",
      descriptor = "[Lrc;"
   )
   public static class587[] field8721;

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(IILica;)V",
      line = 3
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label64: {
            label63: {
               label62: {
                  label61: {
                     label60: {
                        if (~arg1 != -1) {
                           if (~arg1 == -2) {
                              break label60;
                           }

                           if (arg1 == 2) {
                              break label61;
                           }

                           if (arg1 == 3) {
                              break label62;
                           }

                           if (arg1 != 4) {
                              break label64;
                           }

                           if (!var4) {
                              break label63;
                           }
                        }

                        this.field8717 = arg2.method2848(-128);
                        if (!var4) {
                           break label64;
                        }
                     }

                     this.field8712 = arg2.method2848(-107);
                     if (!var4) {
                        break label64;
                     }
                  }

                  this.field8720 = arg2.method2848(-101);
                  if (!var4) {
                     break label64;
                  }
               }

               this.field8718 = arg2.method2848(-100);
               if (!var4) {
                  break label64;
               }
            }

            int var6 = arg2.method2872(2);
            this.field8716[1] = class408.method3277(var6 >> 4, 4080);
            this.field8716[2] = class408.method3277(var6 >> 12, 0);
            this.field8716[0] = class408.method3277(var6, 16711680) << 4;
         }

         if (arg0 != -1) {
            field8722 = null;
         }

         ++field8723;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field8725[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8725[2] : field8725[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(II)[[I",
      line = 73
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field8713;
         int[][] var4 = super.field918.method3276((byte)100, arg1);
         if (arg0 != 32) {
            this.field8720 = 37;
         }

         if (super.field918.field6361) {
            int[][] var5 = this.method539(true, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || var12 < class678.field10127) {
               do {
                  int var13 = var6[var12];
                  int var14 = -this.field8716[0] + var13;
                  if (var14 < 0) {
                     var14 = -var14;
                  }

                  if (~var14 < ~this.field8717) {
                     var9[var12] = var13;
                     var10[var12] = var7[var12];
                     var11[var12] = var8[var12];
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  int var15 = var7[var12];
                  int var16 = -this.field8716[1] + var15;
                  if (var16 < 0) {
                     var16 = -var16;
                  }

                  if (var16 > this.field8717) {
                     var9[var12] = var13;
                     var10[var12] = var15;
                     var11[var12] = var8[var12];
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  int var17 = var8[var12];
                  int var18 = -this.field8716[2] + var17;
                  if (~var18 > -1) {
                     var18 = -var18;
                  }

                  if (var18 > this.field8717) {
                     var9[var12] = var13;
                     var10[var12] = var15;
                     var11[var12] = var17;
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  var9[var12] = this.field8718 * var13 >> 12;
                  var10[var12] = this.field8720 * var15 >> 12;
                  var11[var12] = this.field8712 * var17 >> 12;
                  ++var12;
               } while(var12 < class678.field10127);
            }
         }

         return var4;
      } catch (RuntimeException var20) {
         throw class482.method3757(var20, field8725[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "<init>",
      descriptor = "()V",
      line = 340
   )
   public class592() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(Lpfa;B)I",
      line = 171
   )
   public static final int method4406(class102 arg0, byte arg1) {
      boolean var2 = client.field1786;

      try {
         int var4;
         label38: {
            ++field8719;
            int var3 = arg0.method988((byte)-116, 2);
            if (~var3 != -1) {
               if (var3 == 1) {
                  var4 = arg0.method988((byte)-116, 5);
                  if (!var2) {
                     break label38;
                  }
               }

               if (var3 == 2) {
                  var4 = arg0.method988((byte)-116, 8);
                  if (!var2) {
                     break label38;
                  }
               }

               var4 = arg0.method988((byte)-116, 11);
               if (!var2) {
                  break label38;
               }
            }

            var4 = 0;
         }

         if (arg1 > -52) {
            field8721 = null;
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8725[5] + (arg0 != null ? field8725[2] : field8725[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(ILjava/lang/String;)I",
      line = 200
   )
   public static final int method4407(int arg0, String arg1) {
      boolean var2 = client.field1786;

      try {
         ++field8714;
         if (arg1 == null) {
            return -1;
         } else {
            if (arg0 != 409) {
               field8722 = null;
            }

            int var3 = 0;
            if (var2) {
               if (arg1.equalsIgnoreCase(class626.field9075[var3])) {
                  return var3;
               }

               ++var3;
            }

            while(true) {
               while(class148.field2244 > var3) {
                  if (arg1.equalsIgnoreCase(class626.field9075[var3])) {
                     return var3;
                  }

                  ++var3;
               }

               if (!var2) {
                  return -1;
               }

               if (-1 != 0) {
                  return var3;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8725[0] + arg0 + ',' + (arg1 != null ? field8725[2] : field8725[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "b",
      descriptor = "(B)V",
      line = 245
   )
   public static void method4408(byte arg0) {
      try {
         field8721 = null;
         field8715 = null;
         if (arg0 != -55) {
            field8724 = null;
         }

         field8724 = null;
         field8722 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8725[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(Lbaa;)V",
      line = 258
   )
   public static final void method4409(class109 arg0) {
      if (arg0 != null) {
         for(int var1 = 0; var1 < 2; ++var1) {
            class109 var2 = null;

            for(class109 var3 = class6.field36[var1]; var3 != null; var3 = var3.field1503) {
               if (arg0 == var3) {
                  if (var2 != null) {
                     var2.field1503 = var3.field1503;
                  } else {
                     class6.field36[var1] = var3.field1503;
                  }

                  class67.field884 = true;
                  return;
               }

               var2 = var3;
            }

            class109 var4 = null;

            for(class109 var5 = class777.field11406[var1]; var5 != null; var5 = var5.field1503) {
               if (arg0 == var5) {
                  if (var4 != null) {
                     var4.field1503 = var5.field1503;
                  } else {
                     class777.field11406[var1] = var5.field1503;
                  }

                  class67.field884 = true;
                  return;
               }

               var4 = var5;
            }

            class109 var6 = null;

            for(class109 var7 = class651.field9383[var1]; var7 != null; var7 = var7.field1503) {
               if (arg0 == var7) {
                  if (var6 != null) {
                     var6.field1503 = var7.field1503;
                  } else {
                     class651.field9383[var1] = var7.field1503;
                  }

                  class67.field884 = true;
                  return;
               }

               var6 = var7;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4410(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4411(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
