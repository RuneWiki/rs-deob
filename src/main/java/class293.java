import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class293 {
   @OriginalMember(
      owner = "client!s",
      name = "j",
      descriptor = "I"
   )
   public int field4081;
   @OriginalMember(
      owner = "client!s",
      name = "f",
      descriptor = "I"
   )
   public int field4087;
   @OriginalMember(
      owner = "client!s",
      name = "h",
      descriptor = "I"
   )
   public int field4080;
   @OriginalMember(
      owner = "client!s",
      name = "d",
      descriptor = "[[I"
   )
   public int[][] field4082;
   @OriginalMember(
      owner = "client!s",
      name = "i",
      descriptor = "I"
   )
   public int field4086;
   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4090 = new String[]{method2239(method2238("\u001eg]/")), method2239(method2238("\u001eg^/")), method2239(method2238("\u001eg/n\\\u0004=-/")), method2239(method2238("\u0003<\u007fk")), method2239(method2238("\u0016g=)O")), method2239(method2238("\u001eg\\/")), method2239(method2238("\u001eg_/"))};
   @OriginalMember(
      owner = "client!s",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field4088 = new int[6];
   @OriginalMember(
      owner = "client!s",
      name = "c",
      descriptor = "I"
   )
   public static int field4083;
   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "I"
   )
   public static int field4085;
   @OriginalMember(
      owner = "client!s",
      name = "b",
      descriptor = "I"
   )
   public static int field4089;
   @OriginalMember(
      owner = "client!s",
      name = "e",
      descriptor = "[[[Lqr;"
   )
   public static class72[][][] field4084;

   @OriginalMember(
      owner = "client!s",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public abstract class193 method779(int arg0, int arg1, class193 arg2);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public abstract void method780(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method777(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Llja;[I)V"
   )
   public abstract void method776(class744 arg0, int[] arg1);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2234(int arg0) {
      try {
         field4084 = null;
         field4088 = null;
         if (arg0 != -10985) {
            field4088 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4090[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public abstract boolean method770(class193 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method787(class193 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public abstract void method784(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

   @OriginalMember(
      owner = "client!s",
      name = "YA",
      descriptor = "()V"
   )
   public abstract void method781();

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public abstract void method778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

   @OriginalMember(
      owner = "client!s",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method786(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method790(int arg0, int arg1);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method2235(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 2116912585) {
            this.method784(66, -80, 38, (boolean[][])null, true, 71);
         }

         ++field4089;
         return this.field4082[arg2][arg0];
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4090[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "ka",
      descriptor = "(III)V"
   )
   public abstract void method789(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(BII)I"
   )
   public final int method2236(byte arg0, int arg1, int arg2) {
      try {
         ++field4083;
         int var4 = arg1 >> this.field4086;
         if (arg0 <= 97) {
            this.field4086 = -50;
         }

         int var5 = arg2 >> this.field4086;
         if (var4 >= 0 && var5 >= 0 && var4 <= this.field4087 + -1 && this.field4081 + -1 >= var5) {
            int var6 = this.field4080 + -1 & arg1;
            int var7 = arg2 & this.field4080 + -1;
            int var8 = (-var6 + this.field4080) * this.field4082[var4][var5] + this.field4082[var4 + 1][var5] * var6 >> this.field4086;
            int var9 = (-var6 + this.field4080) * this.field4082[var4][var5 + 1] + this.field4082[var4 + 1][var5 + 1] * var6 >> this.field4086;
            return (-var7 + this.field4080) * var8 + var7 * var9 >> this.field4086;
         } else {
            return 0;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field4090[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "<init>",
      descriptor = "(III[[I)V"
   )
   public class293(int param1, int param2, int param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method2237(int arg0, int arg1, int arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field4085;
         int var5 = class718.field10676 + arg0;
         int var6 = class669.field10064 + arg2;
         if (class353.field5360 != null && arg0 >= 0 && arg2 >= 0 && ~arg0 > ~class323.field4603 && ~class178.field2197 < ~arg2) {
            if (~class261.field3566.field9428.method2175(arg1 + 98) != -1 || ~class693.field10418.field9010 == ~arg3) {
               long var7 = (long)(var5 | var6 << 14 | arg3 << 28);
               class167 var9 = (class167)class561.field8393.method5681(var7, -1);
               if (var9 == null) {
                  class347.method2719(arg3, arg0, arg2);
               } else {
                  class738 var10 = (class738)var9.field2084.method4071((byte)126);
                  if (var10 == null) {
                     class347.method2719(arg3, arg0, arg2);
                  } else {
                     class628 var11;
                     label87: {
                        var11 = (class628)class347.method2719(arg3, arg0, arg2);
                        if (var11 == null) {
                           var11 = new class628(arg0 << 9, class377.field5711[arg3].method2235(arg2, 2116912585, arg0), arg2 << 9, arg3, arg3);
                           if (var4 == 0) {
                              break label87;
                           }
                        }

                        var11.field9129 = var11.field9125 = -1;
                     }

                     var11.field9127 = var10.field10954;
                     var11.field9133 = var10.field10955;

                     int var10000;
                     int var10001;
                     label81:
                     while(true) {
                        class738 var12 = (class738)var9.field2084.method4059((byte)118);
                        if (var12 != null) {
                           label102: {
                              var10000 = var11.field9133;
                              var10001 = var12.field10955;
                              if (var4 != 0) {
                                 break;
                              }

                              if (var10000 != var10001) {
                                 var11.field9129 = var12.field10955;
                                 var11.field9140 = var12.field10954;

                                 do {
                                    class738 var13;
                                    do {
                                       do {
                                          var13 = (class738)var9.field2084.method4059((byte)-36);
                                          if (var13 == null) {
                                             break label102;
                                          }
                                       } while(var11.field9133 == var13.field10955);

                                       var10000 = ~var13.field10955;
                                       var10001 = ~var11.field9129;
                                       if (var4 != 0) {
                                          break label81;
                                       }
                                    } while(var10000 == var10001 && var4 == 0);

                                    var11.field9125 = var13.field10955;
                                    var11.field9138 = var13.field10954;
                                 } while(var4 == 0);
                              }

                              if (var4 == 0) {
                                 continue;
                              }
                           }
                        }

                        var10000 = (arg2 << 9) + 256;
                        var10001 = -11;
                        break;
                     }

                     int var14 = class368.method2858(var10000, (byte)var10001, (arg0 << 9) + 256, arg3);
                     var11.field9005 = (byte)arg3;
                     var11.field9003 = arg0 << 9;
                     var11.field9010 = (byte)arg3;
                     var11.field9007 = arg2 << 9;
                     var11.field8998 = var14;
                     var11.field9130 = arg1;
                     if (class598.method4378(arg0, (byte)-64, arg2)) {
                        ++var11.field9005;
                     }

                     class603.method4400(arg3, arg0, arg2, var14, var11);
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field4090[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method775(class193 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2238(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2239(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
