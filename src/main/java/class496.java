import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class496 extends class294 {
   @OriginalMember(
      owner = "client!nm",
      name = "A",
      descriptor = "S"
   )
   public short field7263;
   @OriginalMember(
      owner = "client!nm",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7265 = new String[]{method3746(method3745("Tj\n\u007f\u0016")), method3746(method3745("A1H=")), method3746(method3745("A)\n\u0016*\u0007")), method3746(method3745("A)\n\u0019*\u0007")), method3746(method3745("A)\n\u0015*\u0007")), method3746(method3745("A)\n\u0006C")), method3746(method3745("A)\nm\u0002A-PoC")), method3746(method3745("A)\n\u0017*\u0007"))};
   @OriginalMember(
      owner = "client!nm",
      name = "C",
      descriptor = "I"
   )
   public static int field7259;
   @OriginalMember(
      owner = "client!nm",
      name = "E",
      descriptor = "I"
   )
   public static int field7260;
   @OriginalMember(
      owner = "client!nm",
      name = "B",
      descriptor = "I"
   )
   public static int field7261;
   @OriginalMember(
      owner = "client!nm",
      name = "F",
      descriptor = "I"
   )
   public static int field7262;
   @OriginalMember(
      owner = "client!nm",
      name = "D",
      descriptor = "I"
   )
   public static int field7264;

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;"
   )
   public static final String method3743(String arg0, boolean arg1) {
      boolean var2 = client.field4564;

      try {
         if (arg1) {
            return null;
         } else {
            ++field7262;
            if (arg0 == null) {
               return null;
            } else {
               int var3;
               int var4;
               int var10000;
               label123: {
                  var3 = 0;
                  var4 = arg0.length();
                  if (var2) {
                     ++var3;
                  }

                  label112:
                  while(true) {
                     if (var4 > var3) {
                        var10000 = class620.method4533(38, arg0.charAt(var3));
                        if (!var2) {
                           if (var10000 != 0) {
                              ++var3;
                              continue;
                           }

                           if (var2) {
                              --var4;
                           }

                           var10000 = ~var4;
                        }
                     } else {
                        var10000 = ~var4;
                     }

                     while(true) {
                        if (var10000 >= ~var3) {
                           break label112;
                        }

                        var10000 = class620.method4533(112, arg0.charAt(var4 + -1));
                        if (var2) {
                           break label123;
                        }

                        if (var10000 == 0) {
                           break label112;
                        }

                        --var4;
                        var10000 = ~var4;
                     }
                  }

                  var10000 = -var3 + var4;
               }

               int var5 = var10000;
               if (~var5 <= -2 && ~var5 >= -13) {
                  StringBuffer var6 = new StringBuffer(var5);
                  int var7 = var3;
                  char var9;
                  if (var2) {
                     char var8 = arg0.charAt(var3);
                     if (class697.method5069(var8, -72)) {
                        var9 = class607.method4454(true, var8);
                        if (var9 != 0) {
                           var6.append(var9);
                        }
                     }

                     var7 = var3 + 1;
                  }

                  while(true) {
                     if (~var7 <= ~var4) {
                        var10000 = var6.length();
                        if (!var2) {
                           if (var10000 == 0) {
                              return null;
                           }

                           return var6.toString();
                        }
                     } else {
                        var10000 = arg0.charAt(var7);
                     }

                     int var12 = var10000;
                     if (class697.method5069((char)var12, -72)) {
                        var9 = class607.method4454(true, (char)var12);
                        if (var9 != 0) {
                           var6.append(var9);
                        }
                     }

                     ++var7;
                  }
               } else {
                  return null;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field7265[5] + (arg0 != null ? field7265[0] : field7265[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "i",
      descriptor = "(I)Z"
   )
   public final boolean method1365(int arg0) {
      try {
         ++field7261;
         if (arg0 != -1) {
            this.field7263 = 23;
         }

         return class750.field10812[(super.field4101 >> class76.field1336) + -class566.field8206 + class54.field1102][(super.field4096 >> class76.field1336) + -class115.field1864 + class54.field1102];
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7265[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "b",
      descriptor = "(ILha;)Z"
   )
   public final boolean method1362(int arg0, class65 arg1) {
      try {
         if (arg0 != 0) {
            this.method1365(-44);
         }

         ++field7260;
         return class461.method3460(this, (byte)110, super.field4091, super.field4096 >> class76.field1336, super.field4101 >> class76.field1336);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7265[2] + arg0 + ',' + (arg1 != null ? field7265[0] : field7265[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "([Lke;B)I"
   )
   public final int method1366(class622[] arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         int var4;
         int var5;
         int var6;
         label115: {
            ++field7259;
            var4 = super.field4101 >> class76.field1336;
            var5 = super.field4096 >> class76.field1336;
            var6 = 0;
            if (~class566.field8206 == ~var4) {
               ++var6;
               if (!var3) {
                  break label115;
               }
            }

            if (class566.field8206 < var4) {
               var6 += 2;
            }
         }

         label110: {
            if (class115.field1864 != var5) {
               if (~var5 <= ~class115.field1864) {
                  break label110;
               }

               var6 += 6;
               if (!var3) {
                  break label110;
               }
            }

            var6 += 3;
         }

         int var7 = class588.field8500[var6];
         if (~(this.field7263 & var7) != -1) {
            return this.method2296(var5, arg0, var4, true);
         } else if (~this.field7263 == -2 && var4 > 0) {
            return this.method2296(var5, arg0, var4 - 1, true);
         } else if (~this.field7263 == -5 && ~class479.field6989 <= ~var4) {
            return this.method2296(var5, arg0, var4 - -1, true);
         } else if (this.field7263 == 8 && ~var5 < -1) {
            return this.method2296(var5 + -1, arg0, var4, true);
         } else if (~this.field7263 == -3 && class357.field5100 >= var5) {
            return this.method2296(var5 + 1, arg0, var4, true);
         } else if (this.field7263 == 16 && var4 > 0 && ~class357.field5100 <= ~var5) {
            return this.method2296(var5 + 1, arg0, var4 - 1, true);
         } else {
            if (arg1 >= -57) {
               this.field7263 = 69;
            }

            if (~this.field7263 == -33 && class479.field6989 >= var4 && class357.field5100 >= var5) {
               return this.method2296(var5 + 1, arg0, var4 + 1, true);
            } else if (~this.field7263 == -129 && ~var4 < -1 && var5 > 0) {
               return this.method2296(var5 + -1, arg0, var4 + -1, true);
            } else if (this.field7263 == 64 && ~class479.field6989 <= ~var4 && ~var5 < -1) {
               return this.method2296(var5 + -1, arg0, var4 + 1, true);
            } else {
               throw new RuntimeException("");
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field7265[7] + (arg0 != null ? field7265[0] : field7265[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(ZLjava/lang/String;)I"
   )
   public static final int method3744(boolean arg0, String arg1) {
      boolean var2 = client.field4564;

      try {
         ++field7264;
         int var3 = arg1.length();
         int var4 = 0;
         int var5 = 0;
         if (arg0) {
            return -15;
         } else {
            while(true) {
               int var10000;
               if (~var5 <= ~var3) {
                  var10000 = var4;
                  if (!var2) {
                     return var4;
                  }
               } else {
                  var10000 = (var4 << 5) - var4 - -class26.method183(arg1.charAt(var5), false);
               }

               var4 = var10000;
               ++var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7265[3] + arg0 + ',' + (arg1 != null ? field7265[0] : field7265[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         super.field4091 = (byte)arg4;
         super.field4097 = arg1;
         this.field7263 = (short)arg5;
         super.field4096 = arg2;
         super.field4101 = arg0;
         super.field4090 = (byte)arg3;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field7265[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3745(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3746(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
