import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class724 {
   @OriginalMember(
      owner = "client!sfa",
      name = "j",
      descriptor = "Ldw;"
   )
   private class748 field10785 = new class748(64);
   @OriginalMember(
      owner = "client!sfa",
      name = "h",
      descriptor = "I"
   )
   public int field10786 = 0;
   @OriginalMember(
      owner = "client!sfa",
      name = "e",
      descriptor = "Leaa;"
   )
   private class526 field10778;
   @OriginalMember(
      owner = "client!sfa",
      name = "f",
      descriptor = "I"
   )
   public int field10783;
   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10787 = new String[]{method5259(method5258("&}>\u001eT}")), method5259(method5258("&}>\u001e_}")), method5259(method5258("&}>\u001e[}")), method5259(method5258("&}>\u001eZ}")), method5259(method5258(".5q\u001ea")), method5259(method5258(";n3\\")), method5259(method5258("&}>\u001e^}")), method5259(method5258("&}>\u001e <u6D\"}")), method5259(method5258("&}>\u001eX}")), method5259(method5258("&}>\u001eY}")), method5259(method5258("&}>\u001e]}"))};
   @OriginalMember(
      owner = "client!sfa",
      name = "d",
      descriptor = "I"
   )
   public static int field10784 = 0;
   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "I"
   )
   public static int field10774;
   @OriginalMember(
      owner = "client!sfa",
      name = "m",
      descriptor = "I"
   )
   public static int field10775;
   @OriginalMember(
      owner = "client!sfa",
      name = "k",
      descriptor = "I"
   )
   public static int field10776;
   @OriginalMember(
      owner = "client!sfa",
      name = "g",
      descriptor = "I"
   )
   public static int field10779;
   @OriginalMember(
      owner = "client!sfa",
      name = "i",
      descriptor = "I"
   )
   public static int field10780;
   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "I"
   )
   public static int field10781;
   @OriginalMember(
      owner = "client!sfa",
      name = "l",
      descriptor = "I"
   )
   public static int field10782;
   @OriginalMember(
      owner = "client!sfa",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field10777;

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(II[ILut;)Lau;",
      line = 7
   )
   public static final class768 method5250(int arg0, int arg1, int[] arg2, class134 arg3) {
      int var4 = client.field4530;

      try {
         ++field10779;
         int[] var5 = null;
         if (arg0 != Integer.MAX_VALUE) {
            method5250(-42, -86, (int[])null, (class134)null);
         }

         int[] var6 = null;
         int[] var7 = null;
         float[][] var8 = null;
         if (arg3.field1697 != null) {
            int var9 = arg3.field1664;
            int[] var10 = new int[var9];
            int[] var11 = new int[var9];
            int[] var12 = new int[var9];
            int[] var13 = new int[var9];
            int[] var14 = new int[var9];
            int[] var15 = new int[var9];
            int var16 = 0;
            if (var4 != 0) {
               var10[var16] = Integer.MAX_VALUE;
               var11[var16] = -2147483647;
               var12[var16] = Integer.MAX_VALUE;
               var13[var16] = -2147483647;
               var14[var16] = Integer.MAX_VALUE;
               var15[var16] = -2147483647;
               ++var16;
            }

            while(true) {
               while(var9 > var16) {
                  var10[var16] = Integer.MAX_VALUE;
                  var11[var16] = -2147483647;
                  var12[var16] = Integer.MAX_VALUE;
                  var13[var16] = -2147483647;
                  var14[var16] = Integer.MAX_VALUE;
                  var15[var16] = -2147483647;
                  ++var16;
               }

               int[] var10000 = new int[var9];
               if (var4 == 0) {
                  int var33;
                  label168: {
                     var6 = var10000;
                     int var17 = 0;
                     if (var4 != 0) {
                        var33 = arg2[var17];
                     } else if (~arg1 >= ~var17) {
                        var33 = var9;
                        if (var4 == 0) {
                           break label168;
                        }
                     } else {
                        var33 = arg2[var17];
                     }

                     while(true) {
                        int var18 = var33;
                        if (~arg3.field1697[var18] == 0) {
                           ++var17;
                        } else {
                           int var19 = arg3.field1697[var18] & 255;
                           int var20 = 0;
                           if (var4 == 0 && ~var20 <= -4) {
                              ++var17;
                           } else {
                              while(true) {
                                 short var21;
                                 if (var20 != 0) {
                                    if (var20 != 1) {
                                       var21 = arg3.field1674[var18];
                                       if (var4 != 0) {
                                          var21 = arg3.field1707[var18];
                                          if (var4 != 0) {
                                             var21 = arg3.field1701[var18];
                                          }
                                       }
                                    } else {
                                       var21 = arg3.field1707[var18];
                                       if (var4 != 0) {
                                          var21 = arg3.field1701[var18];
                                       }
                                    }
                                 } else {
                                    var21 = arg3.field1701[var18];
                                 }

                                 int var22 = arg3.field1696[var21];
                                 int var23 = arg3.field1714[var21];
                                 int var24 = arg3.field1699[var21];
                                 if (~var22 > ~var10[var19]) {
                                    var10[var19] = var22;
                                 }

                                 if (~var11[var19] > ~var22) {
                                    var11[var19] = var22;
                                 }

                                 if (~var23 > ~var12[var19]) {
                                    var12[var19] = var23;
                                 }

                                 if (~var23 < ~var13[var19]) {
                                    var13[var19] = var23;
                                 }

                                 if (~var24 > ~var14[var19]) {
                                    var14[var19] = var24;
                                 }

                                 if (~var15[var19] > ~var24) {
                                    var15[var19] = var24;
                                 }

                                 ++var20;
                                 if (~var20 <= -4) {
                                    ++var17;
                                    break;
                                 }
                              }
                           }
                        }

                        if (~arg1 >= ~var17) {
                           var33 = var9;
                           if (var4 == 0) {
                              break;
                           }
                        } else {
                           var33 = arg2[var17];
                        }
                     }
                  }

                  var8 = new float[var33][];
                  var5 = new int[var9];
                  var7 = new int[var9];
                  int var25 = 0;
                  if (var4 != 0 || var25 < var9) {
                     do {
                        byte var26 = arg3.field1665[var25];
                        if (var26 <= 0) {
                           ++var25;
                        } else {
                           float var28;
                           float var29;
                           float var30;
                           label202: {
                              var5[var25] = (var10[var25] - -var11[var25]) / 2;
                              var6[var25] = (var12[var25] - -var13[var25]) / 2;
                              var7[var25] = (var14[var25] + var15[var25]) / 2;
                              if (var26 == 1) {
                                 int var27 = arg3.field1689[var25];
                                 if (var27 != 0) {
                                    label113: {
                                       if (~var27 >= -1) {
                                          var28 = (float)(-var27) / 1024.0F;
                                          var29 = 1.0F;
                                          if (var4 == 0) {
                                             break label113;
                                          }
                                       }

                                       var29 = (float)var27 / 1024.0F;
                                       var28 = 1.0F;
                                       if (var4 != 0) {
                                          var29 = 1.0F;
                                          var28 = 1.0F;
                                       }
                                    }
                                 } else {
                                    var29 = 1.0F;
                                    var28 = 1.0F;
                                 }

                                 var30 = 64.0F / (float)arg3.field1673[var25];
                                 if (var4 == 0) {
                                    break label202;
                                 }
                              }

                              if (~var26 != -3) {
                                 var29 = (float)arg3.field1703[var25] / 1024.0F;
                                 var28 = (float)arg3.field1689[var25] / 1024.0F;
                                 var30 = (float)arg3.field1673[var25] / 1024.0F;
                                 if (var4 == 0) {
                                    break label202;
                                 }
                              }

                              var29 = 64.0F / (float)arg3.field1703[var25];
                              var28 = 64.0F / (float)arg3.field1689[var25];
                              var30 = 64.0F / (float)arg3.field1673[var25];
                           }

                           var8[var25] = class167.method1351(arg3.field1661[var25], var28, arg3.field1698[var25], arg3.field1716[var25], var29, 15628, class153.method1262(255, arg3.field1681[var25]), var30);
                           ++var25;
                        }
                     } while(var25 < var9);
                  }
                  break;
               }

               var10000[var16] = -2147483647;
               ++var16;
            }
         }

         return new class768(var5, var6, var7, var8);
      } catch (RuntimeException var32) {
         throw class670.method4877(var32, field10787[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10787[4] : field10787[5]) + ',' + (arg3 != null ? field10787[4] : field10787[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(I)V",
      line = 185
   )
   public static void method5251(int arg0) {
      try {
         field10777 = null;
         if (arg0 >= -28) {
            field10784 = 57;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10787[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "(II)V",
      line = 197
   )
   public final void method5252(int arg0, int arg1) {
      try {
         ++field10774;
         class748 var3 = this.field10785;
         synchronized(this.field10785) {
            this.field10785.method5453(arg1, false);
         }

         if (arg0 != Integer.MAX_VALUE) {
            method5254(124);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10787[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(II)Lgca;",
      line = 212
   )
   public final class261 method5253(int arg0, int arg1) {
      try {
         ++field10782;
         class748 var3 = this.field10785;
         class261 var4;
         synchronized(this.field10785) {
            var4 = (class261)this.field10785.method5454((long)arg0, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field10778;
            byte[] var6;
            synchronized(this.field10778) {
               var6 = this.field10778.method3899(-70, arg0, 4);
               if (arg1 != -23347) {
                  field10777 = null;
               }
            }

            class261 var7 = new class261();
            var7.field3557 = this;
            var7.field3569 = arg0;
            if (var6 != null) {
               var7.method1980(new class128(var6), arg1 + 23346);
            }

            var7.method1984(0);
            class748 var8 = this.field10785;
            synchronized(this.field10785) {
               this.field10785.method5455(-2049, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field10787[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "c",
      descriptor = "(I)I",
      line = 248
   )
   public static final int method5254(int arg0) {
      try {
         ++field10776;
         if (arg0 != 4) {
            field10777 = null;
         }

         return class467.field7001;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10787[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(Z)V",
      line = 260
   )
   public final void method5255(boolean arg0) {
      try {
         class748 var2 = this.field10785;
         synchronized(this.field10785) {
            this.field10785.method5445(697465426);
         }

         if (!arg0) {
            this.field10785 = null;
         }

         ++field10781;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10787[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IIZIIII)V",
      line = 273
   )
   public static final void method5256(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         class591.field8736 = arg3;
         class436.field6659 = arg1;
         class491.field7257 = arg6;
         class302.field4316 = arg0;
         if (!arg2) {
            method5250(10, -111, (int[])null, (class134)null);
         }

         class596.field8780 = arg5;
         class397.field6105 = arg4;
         ++field10780;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10787[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "(I)V",
      line = 293
   )
   public final void method5257(int arg0) {
      try {
         class748 var2 = this.field10785;
         synchronized(this.field10785) {
            this.field10785.method5451(arg0 + -16345);
            if (arg0 != 16229) {
               method5256(116, -24, false, 122, 55, 58, -45);
            }
         }

         ++field10775;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10787[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V",
      line = 314
   )
   public class724(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field10778 = arg2;
         this.field10783 = this.field10778.method3875(0, 4);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10787[7] + (arg0 != null ? field10787[4] : field10787[5]) + ',' + arg1 + ',' + (arg2 != null ? field10787[4] : field10787[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5258(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5259(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
