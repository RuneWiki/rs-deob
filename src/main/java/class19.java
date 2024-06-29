import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class19 {
   @OriginalMember(
      owner = "client!kv",
      name = "c",
      descriptor = "[B"
   )
   private byte[] field299;
   @OriginalMember(
      owner = "client!kv",
      name = "k",
      descriptor = "[[B"
   )
   private byte[][] field305;
   @OriginalMember(
      owner = "client!kv",
      name = "o",
      descriptor = "I"
   )
   public int field304;
   @OriginalMember(
      owner = "client!kv",
      name = "b",
      descriptor = "I"
   )
   public int field311;
   @OriginalMember(
      owner = "client!kv",
      name = "n",
      descriptor = "I"
   )
   public int field300;
   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field313 = new String[]{method152(method151("\u0005!\u0010$\u0005")), method152(method151("\u0000\"R\r")), method152(method151("\u0015y\u0010OP")), method152(method151("\u0005!\u0010\"\u0005")), method152(method151("\u00005M\u0011")), method152(method151("\u001c2Y")), method152(method151("\u0007:Y\\")), method152(method151("\u001d?G")), method152(method151("\u001a>S\u0004^")), method152(method151("@y\u0010")), method152(method151("\u000b\"L\u000e")), method152(method151("\u0005!\u0010+\u0005")), method152(method151("\t#")), method152(method151("\u0002#")), method152(method151("\r8N\u0018")), method152(method151("\u0005!\u0010%\u0005")), method152(method151("\u0005!\u0010*\u0005")), method152(method151("\f%")), method152(method151("\u0005!\u0010&\u0005")), method152(method151("\u0005!\u0010'\u0005")), method152(method151("\u0005!\u0010)\u0005")), method152(method151("\u0005!\u0010 \u0005")), method152(method151("\u0005!\u0010#\u0005")), method152(method151("\u0005!\u0010-\u0005")), method152(method151("\u0005!\u0010(\u0005")), method152(method151("\u0005!\u0010]D\u0000>J_\u0005"))};
   @OriginalMember(
      owner = "client!kv",
      name = "l",
      descriptor = "I"
   )
   public static int field295;
   @OriginalMember(
      owner = "client!kv",
      name = "i",
      descriptor = "I"
   )
   public static int field296;
   @OriginalMember(
      owner = "client!kv",
      name = "m",
      descriptor = "I"
   )
   public static int field297;
   @OriginalMember(
      owner = "client!kv",
      name = "q",
      descriptor = "I"
   )
   public static int field298;
   @OriginalMember(
      owner = "client!kv",
      name = "d",
      descriptor = "I"
   )
   public static int field301;
   @OriginalMember(
      owner = "client!kv",
      name = "r",
      descriptor = "I"
   )
   public static int field302;
   @OriginalMember(
      owner = "client!kv",
      name = "h",
      descriptor = "I"
   )
   public static int field303;
   @OriginalMember(
      owner = "client!kv",
      name = "p",
      descriptor = "I"
   )
   public static int field306;
   @OriginalMember(
      owner = "client!kv",
      name = "j",
      descriptor = "I"
   )
   public static int field307;
   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "I"
   )
   public static int field308;
   @OriginalMember(
      owner = "client!kv",
      name = "e",
      descriptor = "I"
   )
   public static int field309;
   @OriginalMember(
      owner = "client!kv",
      name = "g",
      descriptor = "I"
   )
   public static int field310;
   @OriginalMember(
      owner = "client!kv",
      name = "f",
      descriptor = "I"
   )
   public static int field312;

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public final int method139(int arg0, String arg1) {
      try {
         if (arg0 != 46) {
            this.method147((byte)16, -59, (String)null, (class648[])null);
         }

         ++field298;
         return this.method146((class648[])null, arg1, (byte)100);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field313[15] + arg0 + ',' + (arg1 != null ? field313[2] : field313[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(ILjava/lang/String;B[Lpd;I)I"
   )
   public final int method140(int arg0, String arg1, byte arg2, class648[] arg3, int arg4) {
      try {
         ++field306;
         if (~arg0 == -1) {
            arg0 = this.field304;
         }

         int var6 = this.method149(arg1, arg3, class436.field5947, new int[]{arg4}, -122);
         if (arg2 != -43) {
            this.field299 = null;
         }

         int var7 = (var6 + -1) * arg0;
         return this.field311 - -this.field300 + var7;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field313[23] + arg0 + ',' + (arg1 != null ? field313[2] : field313[1]) + ',' + arg2 + ',' + (arg3 != null ? field313[2] : field313[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method141(int arg0) {
      try {
         if (arg0 != 6550) {
            return false;
         } else {
            ++field303;
            return ~class157.field2022 <= -2;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field313[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(Lps;Lse;B)Lfv;"
   )
   public static final class702 method142(class7 arg0, class6 arg1, byte arg2) {
      boolean var3 = client.field1481;

      try {
         if (arg2 > -73) {
            method142((class7)null, (class6)null, (byte)82);
         }

         class702 var4;
         label52: {
            ++field296;
            var4 = class732.method5291(124);
            var4.field10266 = arg1.field78;
            var4.field10269 = arg1;
            if (~var4.field10266 != 0) {
               if (~var4.field10266 == 1) {
                  var4.field10264 = new class431(10000);
                  if (!var3) {
                     break label52;
                  }
               }

               if (var4.field10266 > 18) {
                  if (~var4.field10266 < -99) {
                     var4.field10264 = new class431(260);
                     if (!var3) {
                        break label52;
                     }
                  }

                  var4.field10264 = new class431(100);
                  if (!var3) {
                     break label52;
                  }
               }

               var4.field10264 = new class431(20);
               if (!var3) {
                  break label52;
               }
            }

            var4.field10264 = new class431(260);
         }

         var4.field10264.method3330((byte)-83, arg0);
         var4.field10264.method3338(var4.field10269.method47(9189), 6);
         var4.field10263 = 0;
         return var4;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field313[0] + (arg0 != null ? field313[2] : field313[1]) + ',' + (arg1 != null ? field313[2] : field313[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method143(int arg0, byte arg1) {
      try {
         if (arg1 != -12) {
            this.field305 = null;
         }

         ++field309;
         return 255 & this.field299[arg0];
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field313[24] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public static final void method144(int arg0, int arg1, int arg2, boolean arg3) {
      boolean var4 = client.field1481;

      try {
         ++field295;
         int var5 = class539.field7889 + arg0;
         int var6 = class353.field4940 + arg2;
         if (class548.field8080 != null && ~arg0 <= -1 && arg2 >= 0 && ~class273.field3491 < ~arg0 && ~arg2 > ~class211.field2689) {
            if (class757.field11093.field10978.method2092(-18033) != 0 || ~class204.field2593.field10457 == ~arg1) {
               long var7 = (long)(arg1 << 28 | var6 << 14 | var5);
               class206 var9 = (class206)class207.field2635.method1818(-1, var7);
               if (var9 == null) {
                  class432.method3346(arg1, arg0, arg2);
               } else if (arg3 == 1) {
                  class486 var10 = (class486)var9.field2626.method288(0);
                  if (var10 == null) {
                     class432.method3346(arg1, arg0, arg2);
                  } else {
                     class341 var11;
                     label95: {
                        var11 = (class341)class432.method3346(arg1, arg0, arg2);
                        if (var11 != null) {
                           var11.field4705 = var11.field4692 = -1;
                           if (!var4) {
                              break label95;
                           }
                        }

                        var11 = new class341(arg0 << 9, class659.field9815[arg1].method3284(-1, arg0, arg2), arg2 << 9, arg1, arg1);
                     }

                     var11.field4699 = var10.field6782;
                     var11.field4691 = var10.field6786;

                     int var10000;
                     int var10001;
                     label89:
                     while(true) {
                        class486 var12 = (class486)var9.field2626.method290(17958);
                        if (var12 != null) {
                           label112: {
                              var10000 = ~var12.field6782;
                              var10001 = ~var11.field4699;
                              if (var4) {
                                 break;
                              }

                              if (var10000 != var10001) {
                                 var11.field4705 = var12.field6782;
                                 var11.field4697 = var12.field6786;

                                 do {
                                    class486 var13;
                                    do {
                                       do {
                                          var13 = (class486)var9.field2626.method290(17958);
                                          if (var13 == null) {
                                             break label112;
                                          }
                                       } while(~var11.field4699 == ~var13.field6782);

                                       var10000 = ~var11.field4705;
                                       var10001 = ~var13.field6782;
                                       if (var4) {
                                          break label89;
                                       }
                                    } while(var10000 == var10001 && !var4);

                                    var11.field4692 = var13.field6782;
                                    var11.field4711 = var13.field6786;
                                 } while(!var4);
                              }

                              if (!var4) {
                                 continue;
                              }
                           }
                        }

                        var10000 = (arg0 << 9) + 256;
                        var10001 = arg3;
                        break;
                     }

                     int var14 = class215.method1757(var10000, var10001 == 0, arg1, (arg2 << 9) + 256);
                     var11.field10466 = var14;
                     var11.field4704 = 0;
                     var11.field10467 = arg0 << 9;
                     var11.field10468 = arg2 << 9;
                     var11.field10459 = (byte)arg1;
                     var11.field10457 = (byte)arg1;
                     if (class738.method5357(arg2, arg0, -20749)) {
                        ++var11.field10459;
                     }

                     class318.method2515(arg1, arg0, arg2, var14, var11);
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field313[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(CBI)I"
   )
   public final int method145(char arg0, byte arg1, int arg2) {
      try {
         ++field297;
         if (arg1 < 11) {
            return 9;
         } else {
            return this.field305 == null ? 0 : this.field305[arg2][arg0];
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field313[19] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "([Lpd;Ljava/lang/String;B)I"
   )
   public final int method146(class648[] param1, String param2, byte param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(BILjava/lang/String;[Lpd;)I"
   )
   public final int method147(byte arg0, int arg1, String arg2, class648[] arg3) {
      try {
         ++field302;
         if (arg0 >= -8) {
            this.method146((class648[])null, (String)null, (byte)-35);
         }

         return this.method149(arg2, arg3, class436.field5947, new int[]{arg1}, -128);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field313[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field313[2] : field313[1]) + ',' + (arg3 != null ? field313[2] : field313[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "([Lpd;IILjava/lang/String;)I"
   )
   public final int method148(class648[] arg0, int arg1, int arg2, String arg3) {
      boolean var5 = client.field1481;

      try {
         ++field301;
         int var6 = this.method149(arg3, arg0, class436.field5947, new int[]{arg2}, -124);
         int var7 = 0;
         int var8 = arg1;
         int var9;
         if (var5) {
            var9 = this.method146(arg0, class436.field5947[arg1], (byte)100);
            if (var7 < var9) {
               var7 = var9;
            }

            var8 = arg1 + 1;
         }

         while(true) {
            while(~var8 > ~var6) {
               var9 = this.method146(arg0, class436.field5947[var8], (byte)100);
               if (var7 < var9) {
                  var7 = var9;
               }

               ++var8;
            }

            if (!var5) {
               return var7;
            }

            if (var7 < var7) {
               var7 = var7;
            }

            ++var8;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field313[16] + (arg0 != null ? field313[2] : field313[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field313[2] : field313[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(Ljava/lang/String;[Lpd;[Ljava/lang/String;[II)I"
   )
   public final int method149(String param1, class648[] param2, String[] param3, int[] param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(Ljava/lang/String;[Lpd;BI)Ljava/lang/String;"
   )
   public final String method150(String param1, class648[] param2, byte param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kv",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class19(byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method151(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method152(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
