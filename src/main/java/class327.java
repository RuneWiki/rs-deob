import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class327 extends class70 {
   @OriginalMember(
      owner = "client!aha",
      name = "cb",
      descriptor = "I"
   )
   private int field4963 = 1024;
   @OriginalMember(
      owner = "client!aha",
      name = "X",
      descriptor = "I"
   )
   private int field4975 = 8;
   @OriginalMember(
      owner = "client!aha",
      name = "H",
      descriptor = "I"
   )
   private int field4965 = 0;
   @OriginalMember(
      owner = "client!aha",
      name = "G",
      descriptor = "I"
   )
   private int field4971 = 81;
   @OriginalMember(
      owner = "client!aha",
      name = "K",
      descriptor = "I"
   )
   private int field4967 = 409;
   @OriginalMember(
      owner = "client!aha",
      name = "L",
      descriptor = "I"
   )
   private int field4978 = 1024;
   @OriginalMember(
      owner = "client!aha",
      name = "Z",
      descriptor = "I"
   )
   private int field4966 = 4;
   @OriginalMember(
      owner = "client!aha",
      name = "M",
      descriptor = "I"
   )
   private int field4983 = 204;
   @OriginalMember(
      owner = "client!aha",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4985 = new String[]{method2678(method2677("?\u0003Pl\u0003v")), method2678(method2677("?\u0003Pl\u0007v")), method2678(method2677("?\u0003Pl\u0005v")), method2678(method2677("?\u0003Pl\u0004v")), method2678(method2677("0\u001e].")), method2678(method2677("%E\u001fl;")), method2678(method2677("?\u0003Pl\u0002v")), method2678(method2677("?\u0003Pl\u000ev"))};
   @OriginalMember(
      owner = "client!aha",
      name = "W",
      descriptor = "Lnaa;"
   )
   public static class113 field4977 = new class113(59, 4);
   @OriginalMember(
      owner = "client!aha",
      name = "F",
      descriptor = "Lsn;"
   )
   public static class675 field4982 = new class675();
   @OriginalMember(
      owner = "client!aha",
      name = "S",
      descriptor = "I"
   )
   private int field4968;
   @OriginalMember(
      owner = "client!aha",
      name = "Q",
      descriptor = "I"
   )
   private int field4969;
   @OriginalMember(
      owner = "client!aha",
      name = "J",
      descriptor = "I"
   )
   public static int field4970;
   @OriginalMember(
      owner = "client!aha",
      name = "Y",
      descriptor = "I"
   )
   private int field4973;
   @OriginalMember(
      owner = "client!aha",
      name = "O",
      descriptor = "I"
   )
   public static int field4976;
   @OriginalMember(
      owner = "client!aha",
      name = "U",
      descriptor = "I"
   )
   public static int field4979;
   @OriginalMember(
      owner = "client!aha",
      name = "R",
      descriptor = "I"
   )
   public static int field4980;
   @OriginalMember(
      owner = "client!aha",
      name = "P",
      descriptor = "I"
   )
   public static int field4981;
   @OriginalMember(
      owner = "client!aha",
      name = "bb",
      descriptor = "[I"
   )
   private int[] field4972;
   @OriginalMember(
      owner = "client!aha",
      name = "I",
      descriptor = "[I"
   )
   public static int[] field4984;
   @OriginalMember(
      owner = "client!aha",
      name = "ab",
      descriptor = "[[I"
   )
   private int[][] field4964;
   @OriginalMember(
      owner = "client!aha",
      name = "V",
      descriptor = "[[I"
   )
   private int[][] field4974;

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(IIZIIII[B[B)V"
   )
   public static final void method2674(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, byte[] arg8) {
      boolean var9 = client.field1786;

      try {
         ++field4970;
         int var10 = -(arg4 >> 2);
         int var16 = -(arg4 & 3);
         int var11 = -arg6;
         int var10000;
         if (var9) {
            var10000 = var10;
         } else if (var11 >= 0) {
            var10000 = arg2;
            if (!var9) {
               if (arg2 != 1) {
                  method2675(-99);
                  return;
               }

               return;
            }
         } else {
            var10000 = var10;
         }

         label106:
         while(true) {
            int var12 = var10000;
            int var10001;
            if (var9) {
               var10001 = arg1++;
               arg7[var10001] += arg8[arg5++];
               int var17 = arg1++;
               arg7[var17] += arg8[arg5++];
               int var18 = arg1++;
               arg7[var18] += arg8[arg5++];
               int var19 = arg1++;
               arg7[var19] += arg8[arg5++];
               ++var12;
            }

            while(true) {
               while(var12 < 0) {
                  var10001 = arg1++;
                  arg7[var10001] += arg8[arg5++];
                  var10001 = arg1++;
                  arg7[var10001] += arg8[arg5++];
                  var10001 = arg1++;
                  arg7[var10001] += arg8[arg5++];
                  var10001 = arg1++;
                  arg7[var10001] += arg8[arg5++];
                  ++var12;
               }

               int var13 = var16;
               if (!var9) {
                  if (var9) {
                     var10001 = arg1++;
                     arg7[var10001] += arg8[arg5++];
                     var13 = var16 + 1;
                  }

                  while(true) {
                     while(~var13 > -1) {
                        var10001 = arg1++;
                        arg7[var10001] += arg8[arg5++];
                        ++var13;
                     }

                     arg5 += arg3;
                     arg1 += arg0;
                     if (!var9) {
                        ++var11;
                        if (var11 >= 0) {
                           var10000 = arg2;
                           if (!var9) {
                              if (arg2 != 1) {
                                 method2675(-99);
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = var10;
                        }
                        continue label106;
                     }

                     ++var13;
                  }
               }

               ++var12;
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field4985[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field4985[5] : field4985[4]) + ',' + (arg8 != null ? field4985[5] : field4985[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field4980;
         if (arg0 != 87) {
            method2674(40, 82, false, -63, 82, 2, -3, (byte[])null, (byte[])null);
         }

         int[] var4 = super.field923.method3718(-2, arg1);
         if (super.field923.field7284) {
            int var5 = 0;
            int var6 = class204.field3113[arg1] + this.field4965;
            if (var3) {
               var6 += 4096;
            }

            while(var6 < 0) {
               var6 += 4096;
            }

            if (var3) {
               var6 -= 4096;
            }

            while(var6 > 4096) {
               var6 -= 4096;
            }

            int var7;
            int var10000;
            label167: {
               if (var3) {
                  var10000 = ~this.field4972[var5];
               } else if (~this.field4975 >= ~var5) {
                  var7 = var5 + -1;
                  var10000 = 1 & var5;
                  if (!var3) {
                     break label167;
                  }
               } else {
                  var10000 = ~this.field4972[var5];
               }

               label166:
               while(true) {
                  while(var10000 < ~var6) {
                     var7 = var5 + -1;
                     var10000 = 1 & var5;
                     if (!var3) {
                        break label166;
                     }
                  }

                  ++var5;
                  if (~this.field4975 >= ~var5) {
                     var7 = var5 + -1;
                     var10000 = 1 & var5;
                     if (!var3) {
                        break;
                     }
                  } else {
                     var10000 = ~this.field4972[var5];
                  }
               }
            }

            boolean var8 = var10000 == 0;
            int var9 = this.field4972[var5];
            int var10 = this.field4972[var5 - 1];
            if (var10 - -this.field4969 >= var6 || ~var6 <= ~(var9 - this.field4969)) {
               class107.method1025(var4, 0, class678.field10127, 0);
               if (!var3) {
                  return var4;
               }
            }

            int var11 = 0;
            if (var3 || ~class678.field10127 < ~var11) {
               do {
                  int var12 = !var8 ? -this.field4978 : this.field4978;
                  int var13 = 0;
                  int var14 = (this.field4973 * var12 >> 12) + class199.field3060[var11];
                  if (var3) {
                     var14 += 4096;
                  }

                  while(var14 < 0) {
                     var14 += 4096;
                  }

                  if (var3) {
                     var14 -= 4096;
                  }

                  while(~var14 < -4097) {
                     var14 -= 4096;
                  }

                  int var15;
                  int var16;
                  int var10001;
                  label130: {
                     int var17;
                     if (var3) {
                        var10000 = this.field4974[var7][var13];
                        var10001 = var14;
                     } else if (~var13 <= ~this.field4966) {
                        var15 = var13 + -1;
                        var16 = this.field4974[var7][var13];
                        var17 = this.field4974[var7][var15];
                        var10000 = var14;
                        var10001 = this.field4969 + var17;
                        if (!var3) {
                           break label130;
                        }
                     } else {
                        var10000 = this.field4974[var7][var13];
                        var10001 = var14;
                     }

                     label129:
                     while(true) {
                        while(var10000 > var10001) {
                           var15 = var13 + -1;
                           var16 = this.field4974[var7][var13];
                           var17 = this.field4974[var7][var15];
                           var10000 = var14;
                           var10001 = this.field4969 + var17;
                           if (!var3) {
                              break label129;
                           }
                        }

                        ++var13;
                        if (~var13 <= ~this.field4966) {
                           var15 = var13 + -1;
                           var16 = this.field4974[var7][var13];
                           var17 = this.field4974[var7][var15];
                           var10000 = var14;
                           var10001 = this.field4969 + var17;
                           if (!var3) {
                              break;
                           }
                        } else {
                           var10000 = this.field4974[var7][var13];
                           var10001 = var14;
                        }
                     }
                  }

                  if (var10000 > var10001) {
                     if (~var14 > ~(-this.field4969 + var16)) {
                        var4[var11] = this.field4964[var7][var15];
                        if (var3) {
                           var4[var11] = 0;
                           ++var11;
                        } else {
                           ++var11;
                        }
                     } else {
                        var4[var11] = 0;
                        ++var11;
                     }
                  } else {
                     var4[var11] = 0;
                     ++var11;
                  }
               } while(~class678.field10127 < ~var11);
            }
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class482.method3757(var19, field4985[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "<init>",
      descriptor = "()V"
   )
   public class327() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!aha",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method2675(int arg0) {
      try {
         field4982 = null;
         field4977 = null;
         field4984 = null;
         if (arg0 != 15837) {
            method2675(93);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4985[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "g",
      descriptor = "(I)V"
   )
   private final void method2676(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(IILica;)V"
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         ++field4976;
         if (arg0 != -1) {
            field4982 = null;
         }

         if (arg1 != 0) {
            if (arg1 == 1) {
               this.field4975 = arg2.method2855(-31007);
               return;
            }

            if (~arg1 == -3) {
               this.field4967 = arg2.method2848(arg0 ^ 124);
               return;
            }

            if (arg1 == 3) {
               this.field4983 = arg2.method2848(-123);
               return;
            }

            if (arg1 == 4) {
               this.field4978 = arg2.method2848(-107);
               return;
            }

            if (arg1 == 5) {
               this.field4965 = arg2.method2848(arg0 + -122);
               return;
            }

            if (arg1 == 6) {
               this.field4971 = arg2.method2848(-123);
               return;
            }

            if (~arg1 != -8) {
               return;
            }

            if (!client.field1786) {
               this.field4963 = arg2.method2848(-101);
               return;
            }
         }

         this.field4966 = arg2.method2855(-31007);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4985[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4985[5] : field4985[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method275(boolean arg0) {
      try {
         if (arg0) {
            this.field4966 = -39;
         }

         ++field4979;
         this.method2676(-13631);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4985[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2677(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2678(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
