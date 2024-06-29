import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public abstract class class47 extends class80 {
   @OriginalMember(
      owner = "client!bt",
      name = "E",
      descriptor = "Z"
   )
   public boolean field542;
   @OriginalMember(
      owner = "client!bt",
      name = "y",
      descriptor = "B"
   )
   public byte field546;
   @OriginalMember(
      owner = "client!bt",
      name = "F",
      descriptor = "S"
   )
   public short field548;
   @OriginalMember(
      owner = "client!bt",
      name = "G",
      descriptor = "S"
   )
   public short field547;
   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "S"
   )
   public short field541;
   @OriginalMember(
      owner = "client!bt",
      name = "x",
      descriptor = "S"
   )
   public short field540;
   @OriginalMember(
      owner = "client!bt",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field551 = new String[]{method404(method403("X\u0018WMIT\u0005\rO\b")), method404(method403("X\u0018W=b\u0012")), method404(method403("X\u0018W3a\u0012")), method404(method403("X\u0018W7b\u0012")), method404(method403("X\u0018W:b\u0012")), method404(method403("ABW_]")), method404(method403("X\u0018W4a\u0012")), method404(method403("T\u0019\u0015\u001d")), method404(method403("X\u0018W2a\u0012"))};
   @OriginalMember(
      owner = "client!bt",
      name = "C",
      descriptor = "[I"
   )
   public static int[] field545 = new int[3];
   @OriginalMember(
      owner = "client!bt",
      name = "D",
      descriptor = "Lbga;"
   )
   public static class378 field543 = new class378(120, -2);
   @OriginalMember(
      owner = "client!bt",
      name = "v",
      descriptor = "I"
   )
   public static int field537;
   @OriginalMember(
      owner = "client!bt",
      name = "w",
      descriptor = "I"
   )
   public static int field538;
   @OriginalMember(
      owner = "client!bt",
      name = "B",
      descriptor = "I"
   )
   public static int field539;
   @OriginalMember(
      owner = "client!bt",
      name = "A",
      descriptor = "I"
   )
   public static int field544;
   @OriginalMember(
      owner = "client!bt",
      name = "I",
      descriptor = "I"
   )
   public static int field549;
   @OriginalMember(
      owner = "client!bt",
      name = "H",
      descriptor = "I"
   )
   public static int field550;

   @OriginalMember(
      owner = "client!bt",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method397(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field538;
         int var3 = this.field547;
         if (arg0 != 0) {
            return true;
         } else {
            while(true) {
               short var10000;
               if (~this.field548 > ~var3) {
                  var10000 = 0;
                  if (!var2) {
                     return false;
                  }
               } else {
                  var10000 = this.field540;
               }

               int var4 = var10000;
               if (var2 || this.field541 >= var4) {
                  do {
                     int var5 = var3 - class367.field5174 + class224.field2812;
                     if (~var5 <= -1) {
                        if (var5 >= class426.field5961.length && !var2) {
                           ++var4;
                        } else {
                           int var6 = -class406.field5720 + var4 - -class224.field2812;
                           if (~var6 <= -1) {
                              if (~class426.field5961.length >= ~var6) {
                                 if (var2) {
                                    if (class426.field5961[var5][var6]) {
                                       return true;
                                    }

                                    ++var4;
                                 } else {
                                    ++var4;
                                 }
                              } else {
                                 if (class426.field5961[var5][var6]) {
                                    return true;
                                 }

                                 ++var4;
                              }
                           } else {
                              ++var4;
                           }
                        }
                     } else {
                        ++var4;
                     }
                  } while(this.field541 >= var4);
               }

               ++var3;
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field551[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "j",
      descriptor = "(I)V"
   )
   public void method398(int arg0) {
      try {
         if (arg0 > -99) {
            this.field548 = 28;
         }

         ++field544;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field551[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "g",
      descriptor = "(B)V"
   )
   public static void method399(byte arg0) {
      try {
         field543 = null;
         if (arg0 == 10) {
            field545 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field551[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method400(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 1) {
            return true;
         } else {
            ++field539;
            return (arg1 & 34) != 0;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field551[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "([Loda;I)I"
   )
   public final int method401(class127[] arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         int var4;
         int var6;
         label346: {
            ++field537;
            var4 = 0;
            int var5 = this.field547;
            if (arg1 != 1) {
               method400(-38, 84, 43);
               if (var3) {
                  var6 = this.field540;
               } else if (this.field548 < var5) {
                  var6 = var4;
                  if (!var3) {
                     break label346;
                  }
               } else {
                  var6 = this.field540;
               }
            } else if (this.field548 < var5) {
               var6 = var4;
               if (!var3) {
                  break label346;
               }
            } else {
               var6 = this.field540;
            }

            label345:
            while(true) {
               label343:
               while(var3 || ~var6 >= ~this.field541) {
                  label341:
                  while(true) {
                     label339: {
                        long var7 = class328.field4698[super.field1001][var5][var6];
                        long var9 = 0L;
                        int var11;
                        if (var3) {
                           var11 = (int)(var7 >>> (int)var9 & 65535L);
                           if (~var11 >= -1) {
                              if (var3) {
                                 break label345;
                              }

                              ++var6;
                              break label339;
                           }
                        } else {
                           if (~var9 < -49L) {
                              if (var3) {
                                 break label345;
                              }

                              ++var6;
                              break label339;
                           }

                           var11 = (int)(var7 >>> (int)var9 & 65535L);
                           if (~var11 >= -1) {
                              if (var3) {
                                 break label345;
                              }

                              ++var6;
                              break label339;
                           }
                        }

                        label338:
                        while(true) {
                           label336:
                           while(true) {
                              label334: {
                                 class730 var12 = class166.field2104[var11 + -1];
                                 int var13 = 0;
                                 if (var3) {
                                    if (arg0[var13] == var12.field10676) {
                                       var9 += 16L;
                                       if (!var3) {
                                          break label334;
                                       }

                                       ++var13;
                                    } else {
                                       ++var13;
                                    }
                                 }

                                 while(true) {
                                    if (var13 >= var4) {
                                       arg0[var4++] = var12.field10676;
                                       if (var3) {
                                          if (var4 >= 4) {
                                             if (var3) {
                                                break label345;
                                             }

                                             ++var6;
                                             break label338;
                                          }
                                          continue label336;
                                       }

                                       if (var4 == 4) {
                                          var6 = var4;
                                          if (!var3) {
                                             break label345;
                                          }
                                          continue label341;
                                       }

                                       var9 += 16L;
                                       break;
                                    }

                                    if (arg0[var13] == var12.field10676) {
                                       var9 += 16L;
                                       if (!var3) {
                                          break;
                                       }

                                       ++var13;
                                    } else {
                                       ++var13;
                                    }
                                 }
                              }

                              if (~var9 < -49L) {
                                 if (var3) {
                                    break label345;
                                 }

                                 ++var6;
                                 break label338;
                              }

                              var11 = (int)(var7 >>> (int)var9 & 65535L);
                              if (~var11 >= -1) {
                                 if (var3) {
                                    break label345;
                                 }

                                 ++var6;
                                 break label338;
                              }
                           }
                        }
                     }

                     if (~var6 < ~this.field541) {
                        break label343;
                     }
                  }
               }

               if (var3) {
                  break;
               }

               ++var5;
               if (this.field548 < var5) {
                  var6 = var4;
                  if (!var3) {
                     break;
                  }
               } else {
                  var6 = this.field540;
               }
            }
         }

         if (var3) {
            arg0[var6] = null;
            ++var6;
         }

         while(true) {
            while(~var6 > -5) {
               arg0[var6] = null;
               ++var6;
            }

            if (!var3) {
               if (this.field546 != 0) {
                  int var16;
                  short var17;
                  short var18;
                  int var19;
                  label377: {
                     int var14 = -class367.field5174 + this.field547;
                     int var15 = -class406.field5720 + this.field540;
                     if (this.field546 != 1) {
                        if (var15 > -var14) {
                           var16 = this.field547 + -1;
                           var17 = this.field547;
                           var18 = this.field540;
                           var19 = this.field540 + -1;
                           if (!var3) {
                              break label377;
                           }
                        }

                        var16 = this.field547 + 1;
                        var17 = this.field547;
                        var19 = this.field540 + 1;
                        var18 = this.field540;
                        if (!var3) {
                           break label377;
                        }
                     }

                     if (~var15 >= ~var14) {
                        var16 = this.field547 - 1;
                        var18 = this.field540;
                        var19 = this.field540 + 1;
                        var17 = this.field547;
                        if (!var3) {
                           break label377;
                        }
                     }

                     var19 = this.field540 - 1;
                     var18 = this.field540;
                     var16 = this.field547 + 1;
                     var17 = this.field547;
                  }

                  int var20 = 0;
                  if (var3 || ~var20 > ~var4) {
                     label200:
                     do {
                        long var21 = class328.field4698[super.field1001][var17][var19];
                        class730 var23;
                        if (var3) {
                           var23 = class166.field2104[(int)((var21 & 65535L) + -1L)];
                           var21 >>>= 16;

                           while(arg0[var20] == var23.field10676) {
                              if (!var3) {
                                 if (!var3) {
                                    ++var20;
                                    continue label200;
                                 }
                                 break;
                              }
                           }
                        }

                        while(~var21 != -1L) {
                           var23 = class166.field2104[(int)((var21 & 65535L) + -1L)];
                           var21 >>>= 16;

                           while(arg0[var20] == var23.field10676) {
                              if (!var3) {
                                 if (!var3) {
                                    ++var20;
                                    continue label200;
                                 }
                                 break;
                              }
                           }
                        }

                        long var24 = class328.field4698[super.field1001][var16][var18];
                        class730 var26;
                        int var27;
                        if (var3) {
                           var26 = class166.field2104[(int)((65535L & var24) - 1L)];
                           var24 >>>= 16;
                        } else {
                           if (~var24 == -1L) {
                              var27 = var20;
                              if (var3) {
                                 arg0[var20] = arg0[var20 + 1];
                                 var27 = var20 + 1;
                              }

                              while(true) {
                                 while(~var27 > ~(var4 + -1)) {
                                    arg0[var27] = arg0[var27 + 1];
                                    ++var27;
                                 }

                                 if (!var3) {
                                    --var4;
                                    ++var20;
                                    continue label200;
                                 }

                                 ++var27;
                              }
                           }

                           var26 = class166.field2104[(int)((65535L & var24) - 1L)];
                           var24 >>>= 16;
                        }

                        while(true) {
                           while(arg0[var20] == var26.field10676) {
                              if (!var3) {
                                 if (!var3) {
                                    ++var20;
                                    continue label200;
                                 }
                                 break;
                              }
                           }

                           if (~var24 == -1L) {
                              var27 = var20;
                              if (var3) {
                                 arg0[var20] = arg0[var20 + 1];
                                 var27 = var20 + 1;
                              }

                              while(true) {
                                 while(~var27 > ~(var4 + -1)) {
                                    arg0[var27] = arg0[var27 + 1];
                                    ++var27;
                                 }

                                 if (!var3) {
                                    --var4;
                                    ++var20;
                                    continue label200;
                                 }

                                 ++var27;
                              }
                           }

                           var26 = class166.field2104[(int)((65535L & var24) - 1L)];
                           var24 >>>= 16;
                        }
                     } while(~var20 > ~var4);
                  }
               }

               return var4;
            }

            ++var6;
         }
      } catch (RuntimeException var29) {
         throw class534.method3846(var29, field551[8] + (arg0 != null ? field551[5] : field551[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "b",
      descriptor = "(ZLha;)Z"
   )
   public final boolean method402(boolean arg0, class65 arg1) {
      try {
         ++field549;
         if (!arg0) {
            method399((byte)8);
         }

         return class261.method2007(this.field541, super.field1005, this.field548, this.field540, this.method779(arg1, 0), -31, this.field547);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field551[6] + arg0 + ',' + (arg1 != null ? field551[5] : field551[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "<init>",
      descriptor = "(IIIIIIIIIZB)V"
   )
   public class47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
      try {
         this.field542 = arg9;
         super.field999 = arg2;
         super.field998 = arg3;
         this.field546 = arg10;
         this.field548 = (short)arg6;
         this.field547 = (short)arg5;
         super.field1005 = (byte)arg1;
         super.field1001 = (byte)arg0;
         this.field541 = (short)arg8;
         this.field540 = (short)arg7;
         super.field1003 = arg4;
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field551[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method403(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method404(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
