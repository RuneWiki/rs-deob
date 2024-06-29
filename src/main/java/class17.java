import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public abstract class class17 {
   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field240 = new String[]{method160(method159("Y\u001b+Gc")), method160(method159("I]+$6")), method160(method159("\\\u0006if")), method160(method159("Y\u001b+Yc")), method160(method159("Y\u001b+Xc"))};
   @OriginalMember(
      owner = "client!kh",
      name = "c",
      descriptor = "Ltv;"
   )
   public static class590 field235 = new class590(20);
   @OriginalMember(
      owner = "client!kh",
      name = "d",
      descriptor = "[F"
   )
   public static float[] field238 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "I"
   )
   public static int field234;
   @OriginalMember(
      owner = "client!kh",
      name = "f",
      descriptor = "I"
   )
   public static int field237;
   @OriginalMember(
      owner = "client!kh",
      name = "e",
      descriptor = "I"
   )
   public static int field239;
   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field236;

   @OriginalMember(
      owner = "client!kh",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method140(int arg0);

   @OriginalMember(
      owner = "client!kh",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method141(int arg0);

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(III[I)V"
   )
   public abstract void method142(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "(III)V"
   )
   public abstract void method143(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!kh",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method144(int arg0);

   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "()V"
   )
   public abstract void method145();

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method146(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4273;

      try {
         if (arg3 != 29037) {
            method148((byte)-104);
         }

         class775 var6 = (class775)class30.field366.method3855(117);
         if (var5) {
            class735.method5332(arg4, arg1, var6, arg0, (byte)-62, arg2);
            var6 = (class775)class30.field366.method3866((byte)127);
         }

         while(true) {
            while(var6 != null) {
               class735.method5332(arg4, arg1, var6, arg0, (byte)-62, arg2);
               var6 = (class775)class30.field366.method3866((byte)127);
            }

            ++field239;
            class775 var7 = (class775)class358.field5094.method3855(-37);
            if (!var5) {
               if (var5 || var7 != null) {
                  do {
                     byte var8;
                     label260: {
                        var8 = 1;
                        class120 var9 = var7.field11281.method4086((byte)-123);
                        if (~var7.field11281.field7822 == 0 || var7.field11281.field7814) {
                           var8 = 0;
                           if (!var5) {
                              break label260;
                           }
                        }

                        if (var7.field11281.field7822 != var9.field1457 && var7.field11281.field7822 != var9.field1485 && var7.field11281.field7822 != var9.field1505 && ~var7.field11281.field7822 != ~var9.field1483) {
                           if (~var7.field11281.field7822 != ~var9.field1492 && var7.field11281.field7822 != var9.field1477 && var7.field11281.field7822 != var9.field1467 && ~var7.field11281.field7822 != ~var9.field1496) {
                              break label260;
                           }

                           var8 = 3;
                           if (!var5) {
                              break label260;
                           }
                        }

                        var8 = 2;
                     }

                     if (~var7.field11278 != ~var8) {
                        label261: {
                           int var10 = class415.method3143(var7.field11281, -118);
                           class392 var11 = var7.field11281.field9989;
                           if (var11.field5516 != null) {
                              var11 = var11.method2986(arg3 ^ -28977, class259.field3320);
                           }

                           if (var11 == null || var10 == -1) {
                              var7.field11278 = var8;
                              var7.field11280 = false;
                              var7.field11272 = -1;
                              if (!var5) {
                                 break label261;
                              }
                           }

                           if (var7.field11272 != var10 || var11.field5491 == !var7.field11280) {
                              boolean var12 = false;
                              if (var7.field11262 != null) {
                                 var7.field11288 -= 512;
                                 if (~var7.field11288 >= -1) {
                                    class717.field10509.method2175(var7.field11262);
                                    var7.field11262 = null;
                                    var12 = true;
                                    if (var5) {
                                       var12 = true;
                                    }
                                 }
                              } else {
                                 var12 = true;
                              }

                              if (!var12) {
                                 break label261;
                              }

                              var7.field11259 = null;
                              var7.field11272 = var10;
                              var7.field11282 = null;
                              var7.field11278 = var8;
                              var7.field11288 = var11.field5521;
                              var7.field11280 = var11.field5491;
                              if (!var5) {
                                 break label261;
                              }
                           }

                           var7.field11278 = var8;
                           var7.field11288 = var11.field5521;
                        }
                     }

                     var7.field11258 = var7.field11281.field999;
                     var7.field11293 = var7.field11281.field999 - -(var7.field11281.method3060((byte)38) << 8);
                     var7.field11263 = var7.field11281.field1003;
                     var7.field11275 = var7.field11281.field1003 - -(var7.field11281.method3060((byte)38) << 8);
                     class735.method5332(arg4, arg1, var7, arg0, (byte)77, arg2);
                     var7 = (class775)class358.field5094.method3866((byte)113);
                  } while(var7 != null);
               }

               class775 var13 = (class775)class128.field1610.method1850(0);
               if (!var5 && var13 == null) {
                  return;
               }

               do {
                  byte var14;
                  label262: {
                     var14 = 1;
                     class120 var15 = var13.field11261.method4086((byte)-126);
                     if (~var13.field11261.field7822 == 0 || var13.field11261.field7814) {
                        var14 = 0;
                        if (!var5) {
                           break label262;
                        }
                     }

                     if (~var13.field11261.field7822 != ~var15.field1457 && var13.field11261.field7822 != var15.field1485 && ~var13.field11261.field7822 != ~var15.field1505 && ~var13.field11261.field7822 != ~var15.field1483) {
                        if (~var13.field11261.field7822 != ~var15.field1492 && ~var13.field11261.field7822 != ~var15.field1477 && ~var13.field11261.field7822 != ~var15.field1467 && var13.field11261.field7822 != var15.field1496) {
                           break label262;
                        }

                        var14 = 3;
                        if (!var5) {
                           break label262;
                        }
                     }

                     var14 = 2;
                  }

                  if (~var13.field11278 != ~var14) {
                     label264: {
                        int var16 = class391.method2973(var13.field11261, true);
                        if (var13.field11272 != var16 || !var13.field11280 == var13.field11261.field5697) {
                           boolean var17 = false;
                           if (var13.field11262 != null) {
                              var13.field11288 -= 512;
                              if (~var13.field11288 >= -1) {
                                 class717.field10509.method2175(var13.field11262);
                                 var13.field11262 = null;
                                 var17 = true;
                                 if (var5) {
                                    var17 = true;
                                 }
                              }
                           } else {
                              var17 = true;
                           }

                           if (!var17) {
                              break label264;
                           }

                           var13.field11259 = null;
                           var13.field11278 = var14;
                           var13.field11272 = var16;
                           var13.field11280 = var13.field11261.field5697;
                           var13.field11282 = null;
                           var13.field11288 = var13.field11261.field5682;
                           if (!var5) {
                              break label264;
                           }
                        }

                        var13.field11278 = var14;
                        var13.field11288 = var13.field11261.field5682;
                     }
                  }

                  var13.field11258 = var13.field11261.field999;
                  var13.field11293 = var13.field11261.field999 - -(var13.field11261.method3060((byte)38) << 8);
                  var13.field11263 = var13.field11261.field1003;
                  var13.field11275 = var13.field11261.field1003 + (var13.field11261.method3060((byte)38) << 8);
                  class735.method5332(arg4, arg1, var13, arg0, (byte)-114, arg2);
                  var13 = (class775)class128.field1610.method1847(127);
               } while(var13 != null);

               return;
            }

            var6 = (class775)class30.field366.method3866((byte)127);
         }
      } catch (RuntimeException var19) {
         throw class534.method3846(var19, field240[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "(III[I)V"
   )
   public abstract void method147(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method148(byte arg0) {
      try {
         if (arg0 != 111) {
            field236 = null;
         }

         field238 = null;
         field236 = null;
         field235 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field240[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public abstract void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method150(int arg0);

   @OriginalMember(
      owner = "client!kh",
      name = "c",
      descriptor = "(III[I)V"
   )
   public abstract void method151(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "([ILor;IIIZZI)Lbe;"
   )
   public static final class40 method152(int[] arg0, class670 arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
      try {
         ++field234;
         if (arg6) {
            return null;
         } else if (!arg1.field9783 && (!class685.method5005(arg2, (byte)116) || !class685.method5005(arg3, (byte)108))) {
            return arg1.field9809 ? new class40(arg1, 34037, arg2, arg3, arg5, arg0, arg7, arg4) : new class40(arg1, arg2, arg3, class546.method3944(10, arg2), class546.method3944(10, arg3), arg0);
         } else {
            return new class40(arg1, 3553, arg2, arg3, arg5, arg0, arg7, arg4);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field240[3] + (arg0 != null ? field240[1] : field240[2]) + ',' + (arg1 != null ? field240[1] : field240[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method153(int[] arg0);

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method154(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method155(int arg0);

   @OriginalMember(
      owner = "client!kh",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method156(int arg0);

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "()Lkh;"
   )
   public abstract class17 method157();

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(Lkh;)V"
   )
   public abstract void method158(class17 arg0);

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method159(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method160(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
