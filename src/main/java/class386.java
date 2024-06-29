import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class386 {
   @OriginalMember(
      owner = "client!vk",
      name = "l",
      descriptor = "I"
   )
   private int field5900 = -1;
   @OriginalMember(
      owner = "client!vk",
      name = "e",
      descriptor = "Z"
   )
   private boolean field5910 = true;
   @OriginalMember(
      owner = "client!vk",
      name = "o",
      descriptor = "I"
   )
   private int field5906;
   @OriginalMember(
      owner = "client!vk",
      name = "i",
      descriptor = "I"
   )
   private int field5901;
   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "[Lwj;"
   )
   private class414[] field5903;
   @OriginalMember(
      owner = "client!vk",
      name = "r",
      descriptor = "I"
   )
   private int field5905;
   @OriginalMember(
      owner = "client!vk",
      name = "j",
      descriptor = "I"
   )
   private int field5896;
   @OriginalMember(
      owner = "client!vk",
      name = "g",
      descriptor = "[Lwj;"
   )
   private class414[] field5913;
   @OriginalMember(
      owner = "client!vk",
      name = "m",
      descriptor = "Lwj;"
   )
   private class414 field5908;
   @OriginalMember(
      owner = "client!vk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5914 = new String[]{method2968(method2967("y!&t\u001c")), method2968(method2967("y!&\t]a#|\u000b\u001c")), method2968(method2967("a?dY")), method2968(method2967("td&\u001bI")), method2968(method2967("y!&q\u001c")), method2968(method2967("y!&w\u001c")), method2968(method2967("y!&v\u001c"))};
   @OriginalMember(
      owner = "client!vk",
      name = "p",
      descriptor = "Lsda;"
   )
   public static class269 field5899 = new class269(90, 4);
   @OriginalMember(
      owner = "client!vk",
      name = "c",
      descriptor = "I"
   )
   public static int field5894;
   @OriginalMember(
      owner = "client!vk",
      name = "q",
      descriptor = "I"
   )
   public static int field5897;
   @OriginalMember(
      owner = "client!vk",
      name = "h",
      descriptor = "I"
   )
   private int field5898;
   @OriginalMember(
      owner = "client!vk",
      name = "d",
      descriptor = "I"
   )
   public static int field5902;
   @OriginalMember(
      owner = "client!vk",
      name = "n",
      descriptor = "I"
   )
   public static int field5907;
   @OriginalMember(
      owner = "client!vk",
      name = "b",
      descriptor = "I"
   )
   private int field5909;
   @OriginalMember(
      owner = "client!vk",
      name = "s",
      descriptor = "I"
   )
   public static int field5911;
   @OriginalMember(
      owner = "client!vk",
      name = "t",
      descriptor = "Lat;"
   )
   private class396 field5895;
   @OriginalMember(
      owner = "client!vk",
      name = "k",
      descriptor = "Leaa;"
   )
   public static class526 field5904;
   @OriginalMember(
      owner = "client!vk",
      name = "f",
      descriptor = "Leaa;"
   )
   public static class526 field5912;

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(IIIIBIIILha;I)V",
      line = 3
   )
   public final void method2963(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, class66 arg8, int arg9) {
      int var11 = client.field4530;

      try {
         int var22;
         label169: {
            var22 = 16383 & arg7 - -arg6;
            ++field5911;
            if (~this.field5906 != 0 && this.field5898 != 0) {
               class327 var12 = class91.field1164.method1159(this.field5906, 124);
               if (this.field5895 == null && class91.field1164.method1165(this.field5906, -23239)) {
                  int[] var13 = var12.field4636 == 2 ? class91.field1164.method1168(0.7F, false, this.field5898, 24521, this.field5906, this.field5898) : class91.field1164.method1166((byte)89, 0.7F, this.field5898, this.field5898, false, this.field5906);
                  this.field5895 = arg8.method589(this.field5898, 0, 0, var13, this.field5898, this.field5898);
               }

               if (var12.field4636 == 2) {
                  arg8.method645(arg2, arg9, arg1, arg5, arg0, 0);
               }

               if (this.field5895 == null) {
                  break label169;
               }

               int var14 = var12.field4636 == 2 ? 1 : 0;
               int var15 = arg3 * arg5 / -4096;
               int var16 = arg5 * var22 / 4096 + (-arg5 + arg1) / 2;
               if (var11 != 0) {
                  var16 -= arg5;
               }

               while(~arg5 > ~var16) {
                  var16 -= arg5;
               }

               if (var11 != 0 || var16 < 0) {
                  do {
                     var16 += arg5;
                  } while(var16 < 0);
               }

               if (var11 != 0) {
                  var15 -= arg5;
               }

               while(~var15 < ~arg5) {
                  var15 -= arg5;
               }

               if (var11 != 0) {
                  var15 += arg5;
               }

               while(true) {
                  while(var15 < 0) {
                     var15 += arg5;
                  }

                  int var10000 = -arg5 + var16;
                  if (var11 == 0) {
                     int var17 = var10000;
                     if (var11 != 0 || arg1 > var17) {
                        do {
                           int var18 = -arg5 + var15;
                           if (var11 != 0) {
                              this.field5895.method3028(arg2 + var17, arg9 + var18, arg5, arg5, 1, 0, var14);
                              var18 += arg5;
                           }

                           while(true) {
                              while(arg5 > var18) {
                                 this.field5895.method3028(arg2 + var17, arg9 + var18, arg5, arg5, 1, 0, var14);
                                 var18 += arg5;
                              }

                              var10000 = arg5 + var17;
                              if (var11 == 0) {
                                 var17 = var10000;
                                 break;
                              }

                              var18 = var10000;
                           }
                        } while(arg1 > var17);
                     }

                     if (var11 == 0) {
                        break label169;
                     }
                     break;
                  }

                  var15 = var10000;
               }
            }

            arg8.method645(arg2, arg9, arg1, arg5, arg0, 0);
         }

         int var19 = this.field5909 - 1;
         if (var11 != 0) {
            this.field5913[var19].method3164(arg8, arg2, arg9, arg1, arg5, arg3, var22);
            --var19;
         }

         while(true) {
            while(var19 >= 0) {
               this.field5913[var19].method3164(arg8, arg2, arg9, arg1, arg5, arg3, var22);
               --var19;
            }

            if (var11 == 0) {
               if (arg4 <= 14) {
                  method2966(-128);
                  return;
               }

               return;
            }

            --var19;
         }
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field5914[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field5914[3] : field5914[2]) + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "b",
      descriptor = "(I)V",
      line = 84
   )
   public final void method2964(int arg0) {
      int var2 = client.field4530;

      try {
         if (this.field5903 != null) {
            int var3 = 0;
            if (var2 != 0) {
               this.field5903[var3].method3162();
               ++var3;
            }

            while(~var3 > ~this.field5903.length) {
               this.field5903[var3].method3162();
               ++var3;
            }
         }

         ++field5894;
         this.field5895 = null;
         if (arg0 != 1) {
            this.method2963(66, -89, 91, -49, (byte)45, 26, 57, 63, (class66)null, 107);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5914[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(IBLha;)Z",
      line = 118
   )
   public final boolean method2965(int arg0, byte arg1, class66 arg2) {
      int var4 = client.field4530;

      try {
         ++field5902;
         if (~this.field5900 != ~arg0) {
            this.field5900 = arg0;
            int var5 = class605.method4419(arg0, (byte)-128);
            if (~var5 < -513) {
               var5 = 512;
            }

            if (~var5 >= -1) {
               var5 = 1;
            }

            if (~this.field5898 != ~var5) {
               this.field5895 = null;
               this.field5898 = var5;
            }

            if (this.field5903 != null) {
               label98: {
                  this.field5909 = 0;
                  int[] var6 = new int[this.field5903.length];
                  int var7 = 0;
                  class414[] var10000;
                  if (var4 != 0) {
                     var10000 = this.field5903;
                  } else if (this.field5903.length <= var7) {
                     var10000 = this.field5913;
                     if (var4 == 0) {
                        class31.method219(var10000, var6, 122, 0, this.field5909 + -1);
                        break label98;
                     }
                  } else {
                     var10000 = this.field5903;
                  }

                  while(true) {
                     class414 var8 = var10000[var7];
                     if (var8.method3165(this.field5901, this.field5896, this.field5905, this.field5900)) {
                        var6[this.field5909] = var8.field6333;
                        this.field5913[this.field5909++] = var8;
                     }

                     ++var7;
                     if (this.field5903.length <= var7) {
                        var10000 = this.field5913;
                        if (var4 == 0) {
                           class31.method219(var10000, var6, 122, 0, this.field5909 + -1);
                           break;
                        }
                     } else {
                        var10000 = this.field5903;
                     }
                  }
               }
            }

            this.field5910 = true;
         }

         boolean var9 = false;
         if (arg1 <= 3) {
            this.method2963(55, 101, -32, 32, (byte)23, 103, -94, 35, (class66)null, -109);
         }

         if (this.field5910) {
            this.field5910 = false;
            int var10 = this.field5909 - 1;
            if (var4 != 0 || ~var10 <= -1) {
               do {
                  boolean var11 = this.field5913[var10].method3168(arg2, this.field5908);
                  this.field5910 |= !var11;
                  var9 |= var11;
                  --var10;
               } while(~var10 <= -1);
            }
         }

         return var9;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field5914[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5914[3] : field5914[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "<init>",
      descriptor = "(I[Lwj;IIII)V",
      line = 225
   )
   public class386(int arg0, class414[] arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field5906 = arg0;
         this.field5901 = arg3;
         this.field5903 = arg1;
         this.field5905 = arg5;
         this.field5896 = arg4;
         if (arg1 != null) {
            this.field5913 = new class414[arg1.length];
            this.field5908 = ~arg2 > -1 ? null : arg1[arg2];
         } else {
            this.field5913 = null;
            this.field5908 = null;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field5914[1] + arg0 + ',' + (arg1 != null ? field5914[3] : field5914[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "a",
      descriptor = "(I)V",
      line = 202
   )
   public static void method2966(int arg0) {
      try {
         if (arg0 == 1) {
            field5904 = null;
            field5912 = null;
            field5899 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5914[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2967(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2968(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
