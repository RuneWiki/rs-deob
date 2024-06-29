import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class656 extends class268 {
   @OriginalMember(
      owner = "client!lha",
      name = "J",
      descriptor = "Lod;"
   )
   private class536 field9186 = new class536();
   @OriginalMember(
      owner = "client!lha",
      name = "y",
      descriptor = "I"
   )
   private int field9188 = 256;
   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "I"
   )
   private int field9190 = 0;
   @OriginalMember(
      owner = "client!lha",
      name = "r",
      descriptor = "I"
   )
   private int field9193 = 256;
   @OriginalMember(
      owner = "client!lha",
      name = "n",
      descriptor = "I"
   )
   private int field9173;
   @OriginalMember(
      owner = "client!lha",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9194 = new String[]{method4748(method4747("&:8\"gb")), method4748(method4747("&:8\"ub")), method4748(method4747("1|w\"J")), method4748(method4747("$'5`")), method4748(method4747("&:8\"~b")), method4748(method4747("&:8\"eb")), method4748(method4747("&:8\"zb")), method4748(method4747("&:8\"tb")), method4748(method4747("&:8\"\u000b#<0x\tb")), method4748(method4747("&:8\"{b")), method4748(method4747("&:8\"\u007fb")), method4748(method4747("&:8\"rb")), method4748(method4747("&:8\"fb")), method4748(method4747("&:8\"xb")), method4748(method4747("&:8\"qb")), method4748(method4747("&:8\"|b")), method4748(method4747("&:8\"vb")), method4748(method4747("&:8\"}b")), method4748(method4747("&:8\"yb"))};
   @OriginalMember(
      owner = "client!lha",
      name = "K",
      descriptor = "Lo;"
   )
   public static class31 field9174 = new class31(6, 16);
   @OriginalMember(
      owner = "client!lha",
      name = "E",
      descriptor = "I"
   )
   public static int field9169;
   @OriginalMember(
      owner = "client!lha",
      name = "F",
      descriptor = "I"
   )
   public static int field9170;
   @OriginalMember(
      owner = "client!lha",
      name = "x",
      descriptor = "I"
   )
   public static int field9171;
   @OriginalMember(
      owner = "client!lha",
      name = "p",
      descriptor = "I"
   )
   public static int field9172;
   @OriginalMember(
      owner = "client!lha",
      name = "q",
      descriptor = "I"
   )
   public static int field9175;
   @OriginalMember(
      owner = "client!lha",
      name = "A",
      descriptor = "I"
   )
   public static int field9176;
   @OriginalMember(
      owner = "client!lha",
      name = "u",
      descriptor = "I"
   )
   public static int field9178;
   @OriginalMember(
      owner = "client!lha",
      name = "B",
      descriptor = "I"
   )
   public static int field9179;
   @OriginalMember(
      owner = "client!lha",
      name = "D",
      descriptor = "I"
   )
   public static int field9180;
   @OriginalMember(
      owner = "client!lha",
      name = "v",
      descriptor = "I"
   )
   public static int field9181;
   @OriginalMember(
      owner = "client!lha",
      name = "I",
      descriptor = "I"
   )
   public static int field9182;
   @OriginalMember(
      owner = "client!lha",
      name = "s",
      descriptor = "I"
   )
   public static int field9183;
   @OriginalMember(
      owner = "client!lha",
      name = "L",
      descriptor = "I"
   )
   public static int field9184;
   @OriginalMember(
      owner = "client!lha",
      name = "t",
      descriptor = "I"
   )
   public static int field9185;
   @OriginalMember(
      owner = "client!lha",
      name = "C",
      descriptor = "I"
   )
   public static int field9187;
   @OriginalMember(
      owner = "client!lha",
      name = "w",
      descriptor = "I"
   )
   private int field9192;
   @OriginalMember(
      owner = "client!lha",
      name = "o",
      descriptor = "Z"
   )
   private boolean field9189;
   @OriginalMember(
      owner = "client!lha",
      name = "H",
      descriptor = "Z"
   )
   private boolean field9191;
   @OriginalMember(
      owner = "client!lha",
      name = "G",
      descriptor = "[Lrg;"
   )
   public static class672[] field9177;

   @OriginalMember(
      owner = "client!lha",
      name = "b",
      descriptor = "(B)V"
   )
   public final synchronized void method4736(byte arg0) {
      try {
         ++field9170;
         int var2 = 66 % ((arg0 - -65) / 60);
         this.field9191 = true;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9194[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "e",
      descriptor = "(I)D"
   )
   public final synchronized double method4737(int arg0) {
      try {
         ++field9171;
         if (~this.field9190 > -2) {
            return -1.0D;
         } else if (arg0 != 0) {
            return -0.5874427187583456D;
         } else {
            class470 var2 = (class470)this.field9186.method3855(123);
            return var2 == null ? -1.0D : var2.field6518 - (double)((float)var2.field6514[0].length / (float)class556.field7644);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9194[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4738(int arg0) {
      try {
         if (arg0 != 22778) {
            method4738(21);
         }

         field9174 = null;
         field9177 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9194[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "c",
      descriptor = "()I"
   )
   public final int method668() {
      try {
         ++field9175;
         return 1;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9194[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "b",
      descriptor = "([III)V"
   )
   public final synchronized void method669(int[] arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         ++field9184;
         if (!this.field9189) {
            if (this.method4739(0) == null) {
               if (this.field9191) {
                  this.method3609(95);
                  class174.field2167.method172(-90);
               }

            } else {
               int var5 = arg1 + arg2;
               if (class614.field8578) {
                  var5 <<= 1;
               }

               byte var6 = 0;
               byte var7 = 0;
               class470 var8;
               if (this.field9173 == 2) {
                  var7 = 1;
                  if (var4) {
                     var8 = this.method4739(0);
                     if (var8 == null) {
                        return;
                     }
                  } else {
                     if (~arg1 <= ~var5) {
                        return;
                     }

                     var8 = this.method4739(0);
                     if (var8 == null) {
                        return;
                     }
                  }
               } else {
                  if (~arg1 <= ~var5) {
                     return;
                  }

                  var8 = this.method4739(0);
                  if (var8 == null) {
                     return;
                  }
               }

               label145:
               do {
                  do {
                     int var10000;
                     int var10001;
                     label136: {
                        short[][] var9 = var8.field6514;
                        if (!var4) {
                           if (~var5 >= ~arg1) {
                              var10000 = ~this.field9192;
                              var10001 = ~var9[0].length;
                              break label136;
                           }

                           var10000 = var9[0].length;
                           var10001 = this.field9192;
                           if (var4) {
                              break label136;
                           }

                           if (var10000 <= var10001) {
                              var10000 = ~this.field9192;
                              var10001 = ~var9[0].length;
                              break label136;
                           }
                        }

                        while(true) {
                           if (class614.field8578) {
                              arg0[arg1++] = var9[var6][this.field9192] * this.field9188;
                              arg0[arg1++] = var9[var7][this.field9192] * this.field9193;
                              if (var4) {
                                 var10001 = arg1++;
                                 arg0[var10001] += var9[var6][this.field9192] * this.field9188 + var9[var7][this.field9192] * this.field9193;
                                 ++this.field9192;
                              } else {
                                 ++this.field9192;
                              }
                           } else {
                              var10001 = arg1++;
                              arg0[var10001] += var9[var6][this.field9192] * this.field9188 + var9[var7][this.field9192] * this.field9193;
                              ++this.field9192;
                           }

                           if (~var5 >= ~arg1) {
                              var10000 = ~this.field9192;
                              var10001 = ~var9[0].length;
                              break;
                           }

                           var10000 = var9[0].length;
                           var10001 = this.field9192;
                           if (var4) {
                              break;
                           }

                           if (var10000 <= var10001) {
                              var10000 = ~this.field9192;
                              var10001 = ~var9[0].length;
                              break;
                           }
                        }
                     }

                     if (var10000 <= var10001) {
                        if (var4) {
                           var8 = this.method4739(-96);
                           continue label145;
                        }

                        this.method4741((byte)-96);
                     }

                     if (~arg1 <= ~var5) {
                        return;
                     }

                     var8 = this.method4739(0);
                  } while(var8 != null);

                  return;
               } while(var8 != null);

            }
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field9194[7] + (arg0 != null ? field9194[2] : field9194[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method684(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field9178;
         if (!this.field9189) {
            while(true) {
               class470 var3 = this.method4739(0);
               int var10000;
               if (var3 == null) {
                  var10000 = this.field9191;
                  if (!var2) {
                     if (var10000 != 0) {
                        this.method3609(111);
                        class174.field2167.method172(62);
                     }

                     return;
                  }
               } else {
                  var10000 = ~(var3.field6514[0].length - this.field9192);
               }

               if (var10000 < ~arg0) {
                  this.field9192 += arg0;
                  return;
               }

               arg0 -= var3.field6514[0].length + -this.field9192;
               this.method4741((byte)-96);
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9194[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "b",
      descriptor = "(I)Los;"
   )
   private final synchronized class470 method4739(int arg0) {
      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field9182;
            return (class470)this.field9186.method3855(126);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9194[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method4740(int arg0, int arg1) {
      try {
         this.field9188 = arg0;
         this.field9193 = arg0;
         if (arg1 < -101) {
            ++field9185;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9194[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(B)V"
   )
   private final synchronized void method4741(byte arg0) {
      try {
         ++field9176;
         class470 var2 = this.method4739(0);
         if (var2 != null) {
            if (arg0 != -96) {
               this.method650();
            }

            var2.method3609(95);
            this.field9192 = 0;
            --this.field9190;
            class174.field2167.method175(0, var2.method3448(-166584224), var2);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9194[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(ILha;IIIIIILui;III)V"
   )
   public static final void method4742(int arg0, class65 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class241 arg8, int arg9, int arg10, int arg11) {
      try {
         if (arg9 < arg10 && ~(arg4 + arg9) < ~arg10 && ~arg3 < ~(arg7 - 13) && ~(arg7 + 3) < ~arg3 && arg8.field3005) {
            arg0 = arg6;
         }

         ++field9179;
         int[] var12 = null;
         if (class374.method2898(98, arg8.field2993)) {
            var12 = class645.field9054.method485(arg11, (int)arg8.field3010).field3392;
         } else if (~arg8.field3004 != 0) {
            var12 = class645.field9054.method485(0, arg8.field3004).field3392;
         } else if (!class550.method3974((byte)-88, arg8.field2993)) {
            if (class242.method1814(-52, arg8.field2993)) {
               Object var13 = null;
               class774 var14;
               if (arg8.field2993 != 1007) {
                  var14 = class472.field6533.method3586(64, (int)(arg8.field3010 >>> 32 & 2147483647L));
               } else {
                  var14 = class472.field6533.method3586(arg11 ^ 64, (int)arg8.field3010);
               }

               if (var14.field11186 != null) {
                  var14 = var14.method5539(class259.field3320, -126);
               }

               if (var14 != null) {
                  var12 = var14.field11223;
               }
            }
         } else {
            class243 var15 = (class243)class335.field4808.method1839(-121, (long)((int)arg8.field3010));
            if (var15 != null) {
               class680 var16 = var15.field3043;
               class392 var17 = var16.field9989;
               if (var17.field5516 != null) {
                  var17 = var17.method2986(124, class259.field3320);
               }

               if (var17 != null) {
                  var12 = var17.field5527;
               }
            }
         }

         String var18 = class92.method870(-2545, arg8);
         if (var12 != null) {
            var18 = var18 + class132.method1111(-21996, var12);
         }

         class101.field1310.method619(class25.field323, class768.field11077, -31009, arg9 - -3, arg11, var18, arg0, arg7);
         if (arg8.field2994) {
            class719.field10537.method5482(class101.field1304.method4803(var18, (byte)-128) + (arg9 - -5), arg7 - 12);
         }
      } catch (RuntimeException var20) {
         throw class534.method3846(var20, field9194[15] + arg0 + ',' + (arg1 != null ? field9194[2] : field9194[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field9194[2] : field9194[3]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final synchronized void method4743(boolean arg0, boolean arg1) {
      try {
         this.field9189 = arg1;
         ++field9172;
         if (!arg0) {
            this.method4740(-84, -40);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9194[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "c",
      descriptor = "(B)I"
   )
   public final synchronized int method4744(byte arg0) {
      try {
         ++field9169;
         if (arg0 >= -53) {
            this.method4744((byte)62);
         }

         return this.field9190;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9194[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "b",
      descriptor = "()Lfga;"
   )
   public final class268 method649() {
      try {
         ++field9180;
         return null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9194[14] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(IDI)Los;"
   )
   public final class470 method4745(int arg0, double arg1, int arg2) {
      try {
         class470 var7;
         label18: {
            ++field9181;
            long var5 = (long)(arg2 | this.field9173 << 0);
            var7 = (class470)class174.field2167.method176(false, var5);
            if (var7 == null) {
               var7 = new class470(new short[this.field9173][arg2], arg1);
               if (!client.field4273) {
                  break label18;
               }
            }

            var7.field6518 = arg1;
            class174.field2167.method171(var5, -71);
         }

         if (arg0 <= 25) {
            this.method4740(-71, 59);
         }

         return var7;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9194[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "()Lfga;"
   )
   public final class268 method650() {
      try {
         ++field9187;
         return null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9194[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(Los;B)V"
   )
   public final synchronized void method4746(class470 param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lha",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class656(int arg0) {
      try {
         this.field9173 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9194[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4747(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4748(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
