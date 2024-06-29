import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class782 {
   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11394 = new String[]{method5646(method5645("\\\u0003d9:}\u001d8$;IA")), method5646(method5645("UGdc(")), method5646(method5645("\\\u0003d\f}")), method5646(method5645("@\u001c&!")), method5646(method5645("\\\u0003d\u000f}"))};
   @OriginalMember(
      owner = "client!rj",
      name = "b",
      descriptor = "I"
   )
   public static int field11389 = 0;
   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "D"
   )
   public static double field11392;
   @OriginalMember(
      owner = "client!rj",
      name = "e",
      descriptor = "I"
   )
   public static int field11390;
   @OriginalMember(
      owner = "client!rj",
      name = "c",
      descriptor = "I"
   )
   public static int field11391;
   @OriginalMember(
      owner = "client!rj",
      name = "d",
      descriptor = "I"
   )
   public static int field11393;

   @OriginalMember(
      owner = "client!rj",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field11393;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11394[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(II[BIIZII[B)V"
   )
   public static final void method5642(int arg0, int arg1, byte[] arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, byte[] arg8) {
      boolean var9 = client.field1481;

      try {
         ++field11390;
         int var10 = -(arg3 >> 2);
         int var16 = -(arg3 & 3);
         if (arg5) {
            method5644((class713)null, (class243[])null);
         }

         int var11 = -arg7;
         if (var9 || ~var11 > -1) {
            label88:
            do {
               int var12 = var10;
               int var10001;
               if (var9) {
                  var10001 = arg6++;
                  arg8[var10001] += arg2[arg0++];
                  int var17 = arg6++;
                  arg8[var17] += arg2[arg0++];
                  int var18 = arg6++;
                  arg8[var18] += arg2[arg0++];
                  int var19 = arg6++;
                  arg8[var19] += arg2[arg0++];
                  var12 = var10 + 1;
               }

               while(true) {
                  while(~var12 > -1) {
                     var10001 = arg6++;
                     arg8[var10001] += arg2[arg0++];
                     var10001 = arg6++;
                     arg8[var10001] += arg2[arg0++];
                     var10001 = arg6++;
                     arg8[var10001] += arg2[arg0++];
                     var10001 = arg6++;
                     arg8[var10001] += arg2[arg0++];
                     ++var12;
                  }

                  int var13 = var16;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg6++;
                        arg8[var10001] += arg2[arg0++];
                        var13 = var16 + 1;
                     }

                     while(true) {
                        while(var13 < 0) {
                           var10001 = arg6++;
                           arg8[var10001] += arg2[arg0++];
                           ++var13;
                        }

                        arg6 += arg1;
                        arg0 += arg4;
                        if (!var9) {
                           ++var11;
                           continue label88;
                        }

                        ++var13;
                     }
                  }

                  ++var12;
               }
            } while(~var11 > -1);

         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field11394[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11394[1] : field11394[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field11394[1] : field11394[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;"
   )
   public static final String method5643(int arg0, String[] arg1, int arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         ++field11391;
         if (arg0 == 0) {
            return "";
         } else if (arg0 == 1) {
            String var5 = arg1[arg2];
            return var5 == null ? field11394[3] : var5.toString();
         } else {
            int var6 = arg0 + arg2;
            int var7 = arg3;
            int var8 = arg2;
            if (var4 || ~var6 < ~arg2) {
               do {
                  String var9 = arg1[var8];
                  if (var9 == null) {
                     var7 += 4;
                     if (var4) {
                        var7 += var9.length();
                        ++var8;
                     } else {
                        ++var8;
                     }
                  } else {
                     var7 += var9.length();
                     ++var8;
                  }
               } while(~var6 < ~var8);
            }

            StringBuffer var10 = new StringBuffer(var7);
            int var11 = arg2;
            String var10000;
            if (var4) {
               var10000 = arg1[arg2];
            } else if (~var6 >= ~arg2) {
               var10000 = var10.toString();
               if (!var4) {
                  return var10000;
               }
            } else {
               var10000 = arg1[arg2];
            }

            while(true) {
               String var12 = var10000;
               if (var12 == null) {
                  var10.append(field11394[3]);
                  if (var4) {
                     var10.append(var12);
                     ++var11;
                  } else {
                     ++var11;
                  }
               } else {
                  var10.append(var12);
                  ++var11;
               }

               if (~var6 >= ~var11) {
                  var10000 = var10.toString();
                  if (!var4) {
                     return var10000;
                  }
               } else {
                  var10000 = arg1[var11];
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field11394[2] + arg0 + ',' + (arg1 != null ? field11394[1] : field11394[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(Lnl;[Lue;)V"
   )
   public static final void method5644(class713 arg0, class243[] arg1) {
      if (class446.field6036) {
         int var2 = arg0.method240(1, arg1);
         class158.field2032.method485(var2, arg1);
      }

      if (class659.field9815 == class569.field8364) {
         boolean var3 = false;
         boolean var4 = false;
         int var5;
         int var6;
         if (arg0 instanceof class680) {
            var5 = ((class680)arg0).field10010;
            var6 = ((class680)arg0).field10011;
         } else {
            var5 = arg0.field10467 >> class783.field11447;
            var6 = arg0.field10468 >> class783.field11447;
         }

         class158.field2032.method439(class373.field5223[0].method3288(arg0.field10467, (byte)121, arg0.field10468), class484.method3676(var5, var6), class201.method1669(var5, var6), class347.method2746(var5, var6));
      }

      class328 var7 = arg0.method176((byte)79, class158.field2032);
      if (var7 != null) {
         if (arg0.field10463) {
            class687[] var8 = var7.field4538;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class687 var10 = var8[var9];
               if (var10.field10117) {
                  class762.method5522(var10.field10116 + var10.field10115, var10.field10120 - var10.field10116, var10.field10118 + var10.field10116, -79, var10.field10119 - var10.field10116);
               }
            }
         }

         if (var7.field4535) {
            var7.field4540 = arg0;
            if (class203.field2588) {
               class39 var11 = class422.field5749;
               synchronized(class422.field5749) {
                  class422.field5749.method298((byte)108, var7);
                  return;
               }
            }

            class422.field5749.method298((byte)-113, var7);
            return;
         }

         class697.method5077((byte)1, var7);
      }

   }

   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5645(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5646(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
