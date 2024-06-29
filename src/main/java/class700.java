import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class700 extends class606 {
   @OriginalMember(
      owner = "client!ge",
      name = "N",
      descriptor = "I"
   )
   private int field10088 = 0;
   @OriginalMember(
      owner = "client!ge",
      name = "G",
      descriptor = "I"
   )
   private int field10089 = 0;
   @OriginalMember(
      owner = "client!ge",
      name = "Q",
      descriptor = "I"
   )
   private int field10085 = 0;
   @OriginalMember(
      owner = "client!ge",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10094 = new String[]{method5119(method5118("&\fPut")), method5119(method5118("&\fP}t")), method5119(method5118("&\fP\u007ft")), method5119(method5118("&\fPrt")), method5119(method5118("/\u001c\u0012T")), method5119(method5118(":GP\u0016!")), method5119(method5118("&\fP{t")), method5119(method5118("&\fPyt")), method5119(method5118("&\fPzt"))};
   @OriginalMember(
      owner = "client!ge",
      name = "H",
      descriptor = "Lfm;"
   )
   public static class164 field10087 = new class164(24, -1);
   @OriginalMember(
      owner = "client!ge",
      name = "S",
      descriptor = "I"
   )
   private int field10078;
   @OriginalMember(
      owner = "client!ge",
      name = "J",
      descriptor = "I"
   )
   private int field10079;
   @OriginalMember(
      owner = "client!ge",
      name = "P",
      descriptor = "I"
   )
   private int field10080;
   @OriginalMember(
      owner = "client!ge",
      name = "O",
      descriptor = "I"
   )
   private int field10081;
   @OriginalMember(
      owner = "client!ge",
      name = "D",
      descriptor = "I"
   )
   private int field10082;
   @OriginalMember(
      owner = "client!ge",
      name = "F",
      descriptor = "I"
   )
   public static int field10083;
   @OriginalMember(
      owner = "client!ge",
      name = "M",
      descriptor = "I"
   )
   private int field10084;
   @OriginalMember(
      owner = "client!ge",
      name = "E",
      descriptor = "I"
   )
   public static int field10086;
   @OriginalMember(
      owner = "client!ge",
      name = "K",
      descriptor = "I"
   )
   public static int field10090;
   @OriginalMember(
      owner = "client!ge",
      name = "I",
      descriptor = "I"
   )
   public static int field10091;
   @OriginalMember(
      owner = "client!ge",
      name = "R",
      descriptor = "I"
   )
   public static int field10092;
   @OriginalMember(
      owner = "client!ge",
      name = "L",
      descriptor = "I"
   )
   public static int field10093;

   @OriginalMember(
      owner = "client!ge",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method5112(int arg0) {
      try {
         if (arg0 == 2) {
            field10087 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10094[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(IIII)V"
   )
   private final void method5113(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var5 = 48 % ((39 - arg3) / 44);
         ++field10090;
         int var6 = ~arg0 >= -2049 ? (arg2 + 4096) * arg0 >> 12 : -(arg0 * arg2 >> 12) + arg2 + arg0;
         if (~var6 >= -1) {
            this.field10079 = this.field10081 = this.field10082 = arg0;
         } else {
            int var19 = arg1 * 6;
            int var7 = arg0 - -arg0 - var6;
            int var8 = (-var7 + var6 << 12) / var6;
            int var9 = var19 >> 12;
            int var10 = -(var9 << 12) + var19;
            int var12 = var8 * var6 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var6;
            if (~var9 != -1) {
               if (~var9 == -2) {
                  this.field10081 = var6;
                  this.field10082 = var7;
                  this.field10079 = var15;
                  return;
               }

               if (var9 == 2) {
                  this.field10081 = var6;
                  this.field10079 = var7;
                  this.field10082 = var14;
                  return;
               }

               if (~var9 == -4) {
                  this.field10082 = var6;
                  this.field10079 = var7;
                  this.field10081 = var15;
                  return;
               }

               if (var9 == 4) {
                  this.field10082 = var6;
                  this.field10079 = var14;
                  this.field10081 = var7;
                  return;
               }

               if (var9 != 5) {
                  return;
               }

               if (!client.field10022) {
                  this.field10079 = var6;
                  this.field10081 = var7;
                  this.field10082 = var15;
                  return;
               }
            }

            this.field10082 = var7;
            this.field10079 = var6;
            this.field10081 = var14;
         }
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field10094[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label46: {
            label45: {
               label44: {
                  ++field10092;
                  if (arg1 != 0) {
                     if (arg1 == 1) {
                        break label44;
                     }

                     if (arg1 != 2) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field10085 = arg0.method655((byte)63);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field10088 = (arg0.method638(true) << 12) / 100;
               if (!var4) {
                  break label46;
               }
            }

            this.field10089 = (arg0.method638(true) << 12) / 100;
         }

         if (arg2 >= -6) {
            this.field10078 = 63;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field10094[7] + (arg0 != null ? field10094[5] : field10094[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "<init>",
      descriptor = "()V"
   )
   public class700() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!ge",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field10091;
         if (arg0 != 373) {
            this.field10082 = -4;
         }

         int[][] var4 = super.field8649.method5536(23870, arg1);
         if (super.field8649.field11043) {
            int[][] var5 = this.method4467(0, arg1, (byte)97);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || var12 < class563.field8014) {
               label78:
               do {
                  this.method5116(true, var6[var12], var7[var12], var8[var12]);
                  this.field10080 += this.field10088;
                  this.field10078 += this.field10089;
                  this.field10084 += this.field10085;
                  if (var3) {
                     this.field10084 += 4096;
                  }

                  while(true) {
                     class700 var10000;
                     if (~this.field10084 <= -1) {
                        var10000 = this;
                        if (!var3) {
                           if (this.field10080 < 0) {
                              this.field10080 = 0;
                              if (var3) {
                                 this.field10084 -= 4096;
                              }
                           }

                           while(true) {
                              if (~this.field10084 >= -4097) {
                                 var10000 = this;
                                 if (!var3) {
                                    if (~this.field10080 < -4097) {
                                       this.field10080 = 4096;
                                    }

                                    if (~this.field10078 > -1) {
                                       this.field10078 = 0;
                                    }

                                    if (~this.field10078 < -4097) {
                                       this.field10078 = 4096;
                                    }

                                    this.method5113(this.field10078, this.field10084, this.field10080, arg0 + -251);
                                    var9[var12] = this.field10079;
                                    var10[var12] = this.field10081;
                                    var11[var12] = this.field10082;
                                    ++var12;
                                    continue label78;
                                 }
                              } else {
                                 var10000 = this;
                              }

                              var10000.field10084 -= 4096;
                           }
                        }
                     } else {
                        var10000 = this;
                     }

                     var10000.field10084 += 4096;
                  }
               } while(var12 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field10094[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(Lsa;I)V"
   )
   public static final void method5114(class39 arg0, int arg1) {
      try {
         ++field10093;
         int var2 = -10 % ((arg1 - 62) / 42);
         class506.field7194 = 0;
         class661.field9302 = 0;
         class453.field6595 = new class424();
         class742.field10567 = new class154[1024];
         class183.field2690 = new class532[class668.field9390[class679.field9837] - -1];
         class670.field9408 = 0;
         class152.field2327 = 0;
         class425.method3321(99, arg0);
         class124.method1220((byte)-75, arg0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10094[6] + (arg0 != null ? field10094[5] : field10094[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(IIIIBII)Lns;"
   )
   public static final class382 method5115(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
      try {
         ++field10086;
         long var7 = (long)arg1 * 67481L ^ (long)arg5 * 97549L ^ (long)arg2 * 475427L ^ (long)arg3 * 986053L ^ (long)arg6 * 32147369L ^ (long)arg0 * 76724863L;
         if (arg4 != -117) {
            method5112(-57);
         }

         class382 var9 = (class382)class513.field7286.method1041(var7, 8);
         if (var9 != null) {
            return var9;
         } else {
            class382 var10 = class513.field7285.method143(arg1, arg5, arg2, arg3, arg6, arg0);
            class513.field7286.method1050(-82, var10, var7);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field10094[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "a",
      descriptor = "(ZIII)V"
   )
   private final void method5116(boolean arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         int var10;
         label91: {
            ++field10083;
            int var6 = ~arg2 <= ~arg1 ? arg2 : arg1;
            int var7 = arg3 <= var6 ? var6 : arg3;
            int var8 = ~arg1 <= ~arg2 ? arg2 : arg1;
            int var9 = var8 > arg3 ? arg3 : var8;
            this.field10078 = (var7 + var9) / 2;
            var10 = -var9 + var7;
            if (var10 <= 0) {
               this.field10084 = 0;
               if (!var5) {
                  break label91;
               }
            }

            label92: {
               int var11 = (-arg1 + var7 << 12) / var10;
               int var12 = (var7 - arg2 << 12) / var10;
               int var13 = (-arg3 + var7 << 12) / var10;
               if (arg1 == var7) {
                  this.field10084 = arg2 != var9 ? -var12 + 4096 : 20480 - -var13;
                  if (!var5) {
                     break label92;
                  }
               }

               if (~arg2 != ~var7) {
                  this.field10084 = ~arg1 != ~var9 ? -var11 + 20480 : var12 + 12288;
                  if (!var5) {
                     break label92;
                  }
               }

               this.field10084 = ~arg3 == ~var9 ? var11 + 4096 : 12288 - var13;
            }

            this.field10084 /= 6;
         }

         if (arg0) {
            if (this.field10078 > 0 && this.field10078 < 4096) {
               this.field10080 = (var10 << 12) / (this.field10078 > 2048 ? -(this.field10078 * 2) + 8192 : this.field10078 * 2);
            } else {
               this.field10080 = 0;
            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field10094[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ge",
      name = "c",
      descriptor = "(II)I"
   )
   public static final int method5117(int arg0, int arg1) {
      return class6.field103 != null ? class6.field103[arg0][arg1] & 255 : 0;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5118(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ge",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5119(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
