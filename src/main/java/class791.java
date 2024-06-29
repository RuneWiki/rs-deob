import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class791 {
   @OriginalMember(
      owner = "client!wia",
      name = "e",
      descriptor = "I"
   )
   private int field11505 = 0;
   @OriginalMember(
      owner = "client!wia",
      name = "i",
      descriptor = "[Lwb;"
   )
   public class347[] field11488;
   @OriginalMember(
      owner = "client!wia",
      name = "r",
      descriptor = "I"
   )
   public int field11501;
   @OriginalMember(
      owner = "client!wia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11507 = new String[]{method5684(method5683("\bN{QCW")), method5684(method5683("\bN{Q4\u0016Is\u000b6W")), method5684(method5683("\bN{QNW")), method5684(method5683("\bN{QLW")), method5684(method5683("\u0011Rv\u0013")), method5684(method5683("\u0004\t4Qu")), method5684(method5683("\bN{QMW")), method5684(method5683("\bN{QAW")), method5684(method5683("\bN{QDW")), method5684(method5683("\bN{QBW")), method5684(method5683("\bN{QIW")), method5684(method5683("\bN{QJW")), method5684(method5683("\bN{QOW")), method5684(method5683("\bN{QKW")), method5684(method5683("\bN{Q@W"))};
   @OriginalMember(
      owner = "client!wia",
      name = "p",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field11486 = new BigInteger(method5684(method5683("\u001d\u0011(N>\u001e\u001e+M>\u0019\u0012#IjL\u0010/G9\u0019C#KnH\u001f.L9GA-N9\u001aF{\u00191\u0019\u0013\"MlOF+J1HB\u007f\u001b0\u001aF/NiJ\u001e+I:\u001d\u0010|F1O\u0010\u007fI:H\u0014/M<F\u0011.\u0019jM\u001f,HiJ\u0015{\u001c<GE-O?\u001cF)\u001b>\u001dD/\u001d=F\u0017\"I9\u0019D|\u001ei\u001d\u001fx\u001e>\u001b\u0014~")), 16);
   @OriginalMember(
      owner = "client!wia",
      name = "t",
      descriptor = "Lsd;"
   )
   public static class101 field11495 = new class101(56, -2);
   @OriginalMember(
      owner = "client!wia",
      name = "m",
      descriptor = "Lsda;"
   )
   public static class269 field11502 = new class269(89, 2);
   @OriginalMember(
      owner = "client!wia",
      name = "h",
      descriptor = "Lsd;"
   )
   public static class101 field11504 = new class101(8, -1);
   @OriginalMember(
      owner = "client!wia",
      name = "k",
      descriptor = "I"
   )
   public static int field11485;
   @OriginalMember(
      owner = "client!wia",
      name = "s",
      descriptor = "I"
   )
   public static int field11487;
   @OriginalMember(
      owner = "client!wia",
      name = "f",
      descriptor = "I"
   )
   public static int field11489;
   @OriginalMember(
      owner = "client!wia",
      name = "n",
      descriptor = "I"
   )
   public static int field11490;
   @OriginalMember(
      owner = "client!wia",
      name = "o",
      descriptor = "I"
   )
   public static int field11491;
   @OriginalMember(
      owner = "client!wia",
      name = "j",
      descriptor = "I"
   )
   public static int field11492;
   @OriginalMember(
      owner = "client!wia",
      name = "q",
      descriptor = "I"
   )
   public static int field11494;
   @OriginalMember(
      owner = "client!wia",
      name = "l",
      descriptor = "I"
   )
   public static int field11497;
   @OriginalMember(
      owner = "client!wia",
      name = "u",
      descriptor = "I"
   )
   public static int field11498;
   @OriginalMember(
      owner = "client!wia",
      name = "g",
      descriptor = "I"
   )
   public static int field11499;
   @OriginalMember(
      owner = "client!wia",
      name = "b",
      descriptor = "I"
   )
   public static int field11500;
   @OriginalMember(
      owner = "client!wia",
      name = "d",
      descriptor = "I"
   )
   public static int field11503;
   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "J"
   )
   private long field11493;
   @OriginalMember(
      owner = "client!wia",
      name = "c",
      descriptor = "Lwb;"
   )
   private class347 field11496;
   @OriginalMember(
      owner = "client!wia",
      name = "v",
      descriptor = "Lwb;"
   )
   private class347 field11506;

   @OriginalMember(
      owner = "client!wia",
      name = "d",
      descriptor = "(I)Lwb;",
      line = 4
   )
   public final class347 method5671(int arg0) {
      int var2 = client.field4530;

      try {
         int var3 = 91 % ((arg0 - -45) / 54);
         ++field11490;
         if (~this.field11505 < -1 && this.field11488[this.field11505 + -1] != this.field11506) {
            class347 var4 = this.field11506;
            this.field11506 = var4.field5278;
            return var4;
         } else {
            while(this.field11501 > this.field11505) {
               class347 var5 = this.field11488[this.field11505++].field5278;
               class347 var10000 = var5;

               while(var10000 != this.field11488[this.field11505 + -1]) {
                  this.field11506 = var5.field5278;
                  var10000 = var5;
                  if (var2 == 0) {
                     return var5;
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11507[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(I)I",
      line = 38
   )
   public final int method5672(int arg0) {
      int var2 = client.field4530;

      try {
         ++field11485;
         int var3 = arg0;
         int var4 = 0;
         if (var2 == 0 && ~this.field11501 >= ~var4) {
            return arg0;
         } else {
            do {
               class347 var5 = this.field11488[var4];
               class347 var6 = var5.field5278;
               if (var2 != 0) {
                  var6 = var6.field5278;
                  ++var3;
               }

               while(true) {
                  while(var5 != var6) {
                     var6 = var6.field5278;
                     ++var3;
                  }

                  if (var2 == 0) {
                     ++var4;
                     break;
                  }

                  ++var3;
               }
            } while(~this.field11501 < ~var4);

            return var3;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11507[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "b",
      descriptor = "(I)Lwb;",
      line = 68
   )
   public final class347 method5673(int arg0) {
      int var2 = client.field4530;

      try {
         ++field11503;
         int var3 = -33 / ((9 - arg0) / 35);
         if (this.field11496 == null) {
            return null;
         } else {
            class347 var4 = this.field11488[(int)(this.field11493 & (long)(this.field11501 + -1))];
            class347 var5;
            if (var2 != 0) {
               if (this.field11496.field5280 == this.field11493) {
                  var5 = this.field11496;
                  this.field11496 = this.field11496.field5278;
                  return var5;
               }

               this.field11496 = this.field11496.field5278;
            }

            while(true) {
               while(this.field11496 != var4) {
                  if (this.field11496.field5280 == this.field11493) {
                     var5 = this.field11496;
                     this.field11496 = this.field11496.field5278;
                     return var5;
                  }

                  this.field11496 = this.field11496.field5278;
               }

               this.field11496 = null;
               if (var2 == 0) {
                  return null;
               }

               this.field11496 = this.field11496.field5278;
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11507[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "b",
      descriptor = "(B)I",
      line = 106
   )
   public final int method5674(byte arg0) {
      try {
         if (arg0 > -124) {
            return -59;
         } else {
            ++field11499;
            return this.field11501;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11507[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "c",
      descriptor = "(I)V",
      line = 124
   )
   public static final void method5675(int arg0) {
      int var1 = client.field4530;

      try {
         ++field11498;
         class580.field8592 = 0;
         class665.field9665 = 0;
         int var2 = arg0;
         if (var1 != 0 || arg0 < class690.field10400) {
            do {
               int var3 = class312.field4444 * var2;
               int var4 = 0;
               if (var1 != 0 || ~var4 > ~class312.field4444) {
                  do {
                     int var5 = var3 + var4;
                     class178.field2201[var5].method4580(class186.field2315 * var4, class519.field7557 * var2, class186.field2315, class519.field7557, 0, 0, true, true);
                     ++var4;
                  } while(~var4 > ~class312.field4444);
               }

               ++var2;
            } while(var2 < class690.field10400);

         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11507[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(Lct;I[I[I[I)V",
      line = 161
   )
   public static final void method5676(class155 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
      int var5 = client.field4530;

      try {
         ++field11491;
         if (arg1 >= -74) {
            field11486 = null;
         }

         int var6 = 0;
         if (var5 != 0 || var6 < arg4.length) {
            int var10000;
            int var10001;
            label149:
            do {
               label147:
               do {
                  int var7 = arg4[var6];
                  int var8 = arg2[var6];
                  int var9 = arg3[var6];
                  int var10 = 0;
                  if (var5 == 0) {
                     if (var8 == 0) {
                        ++var6;
                        continue;
                     }

                     var10000 = ~arg0.field6058.length;
                     var10001 = ~var10;
                     if (var5 != 0) {
                        continue label149;
                     }

                     if (var10000 >= var10001) {
                        ++var6;
                        continue;
                     }
                  }

                  do {
                     if (~(var8 & 1) != -1) {
                        if (var7 != -1) {
                           class676 var11 = class576.field8554.method3189(var7, (byte)-89);
                           int var12 = var11.field10152;
                           class146 var13 = arg0.field6058[var10];
                           if (var13 != null) {
                              if (~var13.field1836 == ~var7) {
                                 if (~var12 != -1) {
                                    label120: {
                                       if (var12 != 1) {
                                          if (~var12 != -3) {
                                             break label120;
                                          }

                                          var13.field1835 = 0;
                                          if (var5 == 0) {
                                             break label120;
                                          }
                                       }

                                       var13.field1834 = 1;
                                       var13.field1832 = var9;
                                       var13.field1833 = 0;
                                       var13.field1835 = 0;
                                       var13.field1831 = 0;
                                       if (!arg0.field6025) {
                                          class718.method5194(arg0, 0, var11, true);
                                          if (var5 != 0) {
                                             var13 = arg0.field6058[var10] = null;
                                          }
                                       }
                                    }
                                 } else {
                                    var13 = arg0.field6058[var10] = null;
                                 }
                              } else if (~var11.field10162 <= ~class576.field8554.method3189(var13.field1836, (byte)-51).field10162) {
                                 var13 = arg0.field6058[var10] = null;
                              }
                           }

                           if (var13 == null) {
                              class146 var14 = arg0.field6058[var10] = new class146();
                              var14.field1835 = 0;
                              var14.field1831 = 0;
                              var14.field1836 = var7;
                              var14.field1834 = 1;
                              var14.field1833 = 0;
                              var14.field1832 = var9;
                              if (!arg0.field6025) {
                                 class718.method5194(arg0, 0, var11, true);
                                 if (var5 != 0) {
                                    arg0.field6058[var10] = null;
                                 }
                              }
                           }

                           var8 >>>= 1;
                           ++var10;
                        } else {
                           arg0.field6058[var10] = null;
                           var8 >>>= 1;
                           ++var10;
                        }
                     } else {
                        var8 >>>= 1;
                        ++var10;
                     }

                     if (var8 == 0) {
                        ++var6;
                        continue label147;
                     }

                     var10000 = ~arg0.field6058.length;
                     var10001 = ~var10;
                     if (var5 != 0) {
                        continue label149;
                     }
                  } while(var10000 < var10001);

                  ++var6;
               } while(var6 < arg4.length);

               return;
            } while(var10000 < var10001);

         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field11507[7] + (arg0 != null ? field11507[5] : field11507[4]) + ',' + arg1 + ',' + (arg2 != null ? field11507[5] : field11507[4]) + ',' + (arg3 != null ? field11507[5] : field11507[4]) + ',' + (arg4 != null ? field11507[5] : field11507[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(B)Lwb;",
      line = 261
   )
   public final class347 method5677(byte arg0) {
      try {
         ++field11497;
         if (arg0 != 44) {
            method5676((class155)null, 46, (int[])null, (int[])null, (int[])null);
         }

         this.field11505 = 0;
         return this.method5671(97);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11507[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "b",
      descriptor = "(Z)V",
      line = 273
   )
   public static void method5678(boolean arg0) {
      try {
         if (!arg0) {
            field11502 = null;
         }

         field11504 = null;
         field11502 = null;
         field11486 = null;
         field11495 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11507[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(Z[Lwb;)I",
      line = 286
   )
   public final int method5679(boolean arg0, class347[] arg1) {
      int var3 = client.field4530;

      try {
         ++field11494;
         int var4 = 0;
         int var5 = 0;
         if (var3 == 0 && var5 >= this.field11501) {
            if (!arg0) {
               field11504 = null;
            }

            return var4;
         } else {
            do {
               class347 var6 = this.field11488[var5];
               class347 var7 = var6.field5278;
               if (var3 != 0) {
                  arg1[var4++] = var7;
                  var7 = var7.field5278;
               }

               while(true) {
                  while(var6 != var7) {
                     arg1[var4++] = var7;
                     var7 = var7.field5278;
                  }

                  if (var3 == 0) {
                     ++var5;
                     break;
                  }

                  var7 = var7.field5278;
               }
            } while(var5 < this.field11501);

            if (!arg0) {
               field11504 = null;
            }

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field11507[11] + arg0 + ',' + (arg1 != null ? field11507[5] : field11507[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(Z)V",
      line = 318
   )
   public final void method5680(boolean arg0) {
      int var2 = client.field4530;

      try {
         int var3 = 0;
         class791 var10000;
         class347 var4;
         if (var2 != 0) {
            var4 = this.field11488[var3];
         } else {
            if (~var3 <= ~this.field11501) {
               ++field11500;
               var10000 = this;
               if (var2 == 0) {
                  this.field11506 = null;
                  if (!arg0) {
                     this.field11488 = null;
                  }

                  this.field11496 = null;
                  return;
               }
            } else {
               var10000 = this;
            }

            var4 = var10000.field11488[var3];
         }

         while(true) {
            while(true) {
               class347 var5 = var4.field5278;
               if (var4 != var5) {
                  var5.method2720(0);
                  if (var2 != 0) {
                     break;
                  }

                  if (var2 == 0) {
                     continue;
                  }

                  ++var3;
                  break;
               }

               ++var3;
               break;
            }

            if (~var3 <= ~this.field11501) {
               ++field11500;
               var10000 = this;
               if (var2 == 0) {
                  this.field11506 = null;
                  if (!arg0) {
                     this.field11488 = null;
                  }

                  this.field11496 = null;
                  return;
               }
            } else {
               var10000 = this;
            }

            var4 = var10000.field11488[var3];
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11507[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(JI)Lwb;",
      line = 353
   )
   public final class347 method5681(long arg0, int arg1) {
      int var4 = client.field4530;

      try {
         this.field11493 = arg0;
         ++field11487;
         class347 var5 = this.field11488[(int)((long)(this.field11501 + arg1) & arg0)];
         this.field11496 = var5.field5278;
         class347 var6;
         if (var4 != 0) {
            if (this.field11496.field5280 == arg0) {
               var6 = this.field11496;
               this.field11496 = this.field11496.field5278;
               return var6;
            }

            this.field11496 = this.field11496.field5278;
         }

         while(true) {
            while(this.field11496 != var5) {
               if (this.field11496.field5280 == arg0) {
                  var6 = this.field11496;
                  this.field11496 = this.field11496.field5278;
                  return var6;
               }

               this.field11496 = this.field11496.field5278;
            }

            this.field11496 = null;
            if (var4 == 0) {
               return null;
            }

            this.field11496 = this.field11496.field5278;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11507[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(JLwb;B)V",
      line = 379
   )
   public final void method5682(long arg0, class347 arg1, byte arg2) {
      try {
         ++field11492;
         if (arg1.field5277 != null) {
            arg1.method2720(arg2 + -7);
         }

         class347 var5 = this.field11488[(int)((long)(this.field11501 + -1) & arg0)];
         if (arg2 != 7) {
            this.method5681(-21L, 117);
         }

         arg1.field5277 = var5.field5277;
         arg1.field5278 = var5;
         arg1.field5277.field5278 = arg1;
         arg1.field5278.field5277 = arg1;
         arg1.field5280 = arg0;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11507[3] + arg0 + ',' + (arg1 != null ? field11507[5] : field11507[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "<init>",
      descriptor = "(I)V",
      line = 407
   )
   public class791(int arg0) {
      try {
         this.field11488 = new class347[arg0];
         this.field11501 = arg0;

         for(int var2 = 0; var2 < arg0; ++var2) {
            class347 var3 = this.field11488[var2] = new class347();
            var3.field5277 = var3;
            var3.field5278 = var3;
         }

      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11507[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5683(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5684(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
