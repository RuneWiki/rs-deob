import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class532 extends class310 {
   @OriginalMember(
      owner = "client!mq",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7761 = new String[]{method3988(method3987("B_+[\u0016")), method3988(method3987("A[i{")), method3988(method3987("T\u0000+9C")), method3988(method3987("B_+Y\u0016")), method3988(method3987("B_+P\u0016")), method3988(method3987("B_+\\\u0016")), method3988(method3987("B_+Z\u0016")), method3988(method3987("B_+^\u0016")), method3988(method3987("B_+T\u0016")), method3988(method3987("B_+_\u0016"))};
   @OriginalMember(
      owner = "client!mq",
      name = "B",
      descriptor = "I"
   )
   public static int field7749;
   @OriginalMember(
      owner = "client!mq",
      name = "t",
      descriptor = "I"
   )
   public static int field7751;
   @OriginalMember(
      owner = "client!mq",
      name = "D",
      descriptor = "I"
   )
   public static int field7754;
   @OriginalMember(
      owner = "client!mq",
      name = "r",
      descriptor = "I"
   )
   public static int field7755;
   @OriginalMember(
      owner = "client!mq",
      name = "u",
      descriptor = "I"
   )
   public static int field7756;
   @OriginalMember(
      owner = "client!mq",
      name = "z",
      descriptor = "I"
   )
   public static int field7757;
   @OriginalMember(
      owner = "client!mq",
      name = "A",
      descriptor = "I"
   )
   public static int field7759;
   @OriginalMember(
      owner = "client!mq",
      name = "w",
      descriptor = "I"
   )
   public static int field7760;
   @OriginalMember(
      owner = "client!mq",
      name = "E",
      descriptor = "J"
   )
   public static long field7746;
   @OriginalMember(
      owner = "client!mq",
      name = "s",
      descriptor = "Ltd;"
   )
   private class476 field7747;
   @OriginalMember(
      owner = "client!mq",
      name = "x",
      descriptor = "Ltd;"
   )
   private class476 field7748;
   @OriginalMember(
      owner = "client!mq",
      name = "v",
      descriptor = "Ltd;"
   )
   private class476 field7750;
   @OriginalMember(
      owner = "client!mq",
      name = "y",
      descriptor = "Ltd;"
   )
   private class476 field7752;
   @OriginalMember(
      owner = "client!mq",
      name = "C",
      descriptor = "Ltd;"
   )
   public class476 field7753;
   @OriginalMember(
      owner = "client!mq",
      name = "F",
      descriptor = "Ltd;"
   )
   private class476 field7758;

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(B)Z",
      line = 6
   )
   public final boolean method59(byte arg0) {
      try {
         ++field7760;
         if (!super.method59((byte)-47)) {
            return false;
         } else {
            int var2 = -79 / ((arg0 - 62) / 51);
            class411 var3 = (class411)super.field4464;
            if (!super.field4479.method1335((byte)115, var3.field6027)) {
               return false;
            } else if (!super.field4479.method1335((byte)115, var3.field6020)) {
               return false;
            } else if (!super.field4479.method1335((byte)115, var3.field6019)) {
               return false;
            } else if (!super.field4479.method1335((byte)115, var3.field6018)) {
               return false;
            } else if (!super.field4479.method1335((byte)115, var3.field6021)) {
               return false;
            } else {
               return super.field4479.method1335((byte)115, var3.field6024);
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7761[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(III)Z",
      line = 47
   )
   public static final boolean method3984(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         ++field7757;
         if (!class442.field6452) {
            return false;
         } else {
            int var4 = arg0 >> 16;
            if (arg1 != -3525) {
               method3985((class65)null, 78, -96, true);
            }

            int var5 = 65535 & arg0;
            if (class253.field3608[var4] != null && class253.field3608[var4][var5] != null) {
               int var10000;
               class303 var6;
               class587 var7;
               label193: {
                  var6 = class253.field3608[var4][var5];
                  if (arg2 != -1 || var6.field4270 != 0) {
                     var7 = (class587)class685.field10080.method2579(arg1 ^ 3812);
                     if (var3) {
                        if (var7.field8489 == arg2 && var6.field4263 == var7.field8483 && (var7.field8485 == 44 || var7.field8485 == 1003 || ~var7.field8485 == -51 || var7.field8485 == 48 || var7.field8485 == 51)) {
                           return true;
                        }

                        var7 = (class587)class685.field10080.method2583(1);
                     }

                     while(true) {
                        while(var7 != null) {
                           if (var7.field8489 == arg2 && var6.field4263 == var7.field8483 && (var7.field8485 == 44 || var7.field8485 == 1003 || ~var7.field8485 == -51 || var7.field8485 == 48 || var7.field8485 == 51)) {
                              return true;
                           }

                           var7 = (class587)class685.field10080.method2583(1);
                        }

                        if (!var3) {
                           if (!var3) {
                              var10000 = 0;
                              if (!var3) {
                                 return false;
                              }
                              break label193;
                           }
                           break;
                        }

                        var7 = (class587)class685.field10080.method2583(1);
                     }
                  }

                  var7 = (class587)class685.field10080.method2579(arg1 ^ 3812);
                  if (var3) {
                     var10000 = var7.field8485;
                  } else if (var7 == null) {
                     var10000 = 0;
                     if (!var3) {
                        return false;
                     }
                  } else {
                     var10000 = var7.field8485;
                  }
               }

               while(true) {
                  if (var10000 != 44 && ~var7.field8485 != -1004 && ~var7.field8485 != -51 && var7.field8485 != 48 && ~var7.field8485 != -52) {
                     var7 = (class587)class685.field10080.method2583(1);
                  } else {
                     class303 var8 = method3986(true, var7.field8483);
                     if (var3) {
                        if (~var6.field4263 == ~var8.field4263) {
                           return true;
                        }

                        var8 = class98.method946(var8, -1);
                     }

                     while(var8 != null) {
                        if (~var6.field4263 == ~var8.field4263) {
                           return true;
                        }

                        var8 = class98.method946(var8, -1);
                     }

                     var7 = (class587)class685.field10080.method2583(1);
                  }

                  if (var7 == null) {
                     var10000 = 0;
                     if (!var3) {
                        return false;
                     }
                  } else {
                     var10000 = var7.field8485;
                  }
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field7761[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(IZIZ)V",
      line = 115
   )
   public final void method2397(int arg0, boolean arg1, int arg2, boolean arg3) {
      try {
         ++field7759;
         if (arg1) {
            this.method2397(-128, true, -61, true);
         }

         int var5 = this.field7747.method3009() + arg2;
         int var6 = arg2 - (-super.field4464.field6555 - -this.field7748.method3009());
         int var7 = arg0 + this.field7752.method3000();
         int var8 = arg0 - -super.field4464.field6566 - this.field7750.method3000();
         int var9 = var6 - var5;
         int var10 = -var7 + var8;
         int var11 = var9 * this.method2417(-97) / 10000;
         int[] var12 = new int[4];
         class444.field6473.method254(var12);
         class444.field6473.method333(var5, var7, var5 - -var11, var8);
         this.method3218(var9, (byte)47, var10, var5, var7);
         class444.field6473.method333(var5 - -var11, var7, var6, var8);
         this.field7758.method3607(var5, var7, var9, var10);
         class444.field6473.method333(var12[0], var12[1], var12[2], var12[3]);
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field7761[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(Lha;IIZ)Luu;",
      line = 148
   )
   public static final class300 method3985(class65 arg0, int arg1, int arg2, boolean arg3) {
      boolean var4 = client.field4564;

      try {
         ++field7756;
         if (~arg2 == 0) {
            return null;
         } else {
            if (class621.field9057 != null) {
               int var5 = 0;
               if (var4 || var5 < class621.field9057.length) {
                  do {
                     if (class621.field9057[var5] == arg2) {
                        return class262.field3722[var5];
                     }

                     ++var5;
                  } while(var5 < class621.field9057.length);
               }
            }

            class300 var6 = (class300)class769.field11205.method1584((long)arg2, 1);
            if (var6 != null) {
               if (arg3 && var6.field4198 == null) {
                  class445 var7 = class85.method843(class696.field10200, arg2, (byte)-116);
                  if (var7 == null) {
                     return null;
                  }

                  var6.field4198 = var7;
               }

               return var6;
            } else {
               class94[] var8 = class94.method907(class360.field5393, arg2);
               if (var8 == null) {
                  return null;
               } else {
                  if (arg1 != -27775) {
                     method3984(61, -102, 9);
                  }

                  class445 var9 = class85.method843(class696.field10200, arg2, (byte)-105);
                  if (var9 == null) {
                     return null;
                  } else {
                     class300 var10;
                     label56: {
                        if (!arg3) {
                           var10 = new class300(arg0.method414(var9, var8, true));
                           if (!var4) {
                              break label56;
                           }
                        }

                        var10 = new class300(arg0.method414(var9, var8, true), var9);
                     }

                     class769.field11205.method1581((long)arg2, 0, var10);
                     return var10;
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field7761[0] + (arg0 != null ? field7761[2] : field7761[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(IBIII)V",
      line = 215
   )
   public void method3218(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         int var6 = -58 % ((arg1 - -64) / 36);
         this.field7753.method3607(arg3, arg4, arg0, arg2);
         ++field7749;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field7761[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(IIZB)V",
      line = 225
   )
   public final void method2395(int arg0, int arg1, boolean arg2, byte arg3) {
      try {
         if (arg3 == 36) {
            ++field7754;
            if (arg2) {
               int[] var5 = new int[4];
               class444.field6473.method254(var5);
               class444.field6473.method333(arg1, arg0, super.field4464.field6555 + arg1, super.field4464.field6566 + arg0);
               int var6 = this.field7747.method3009();
               int var7 = this.field7747.method3000();
               int var8 = this.field7748.method3009();
               int var9 = this.field7748.method3000();
               this.field7747.method3609(arg1, (-var7 + super.field4464.field6566) / 2 + arg0);
               this.field7748.method3609(super.field4464.field6555 + arg1 + -var8, arg0 - -((-var9 + super.field4464.field6566) / 2));
               class444.field6473.method333(arg1, arg0, arg1 - -super.field4464.field6555, this.field7752.method3000() + arg0);
               this.field7752.method3607(arg1 + var6, arg0, super.field4464.field6555 - var6 + -var8, super.field4464.field6566);
               int var10 = this.field7750.method3000();
               class444.field6473.method333(arg1, super.field4464.field6566 + arg0 + -var10, arg1 - -super.field4464.field6555, super.field4464.field6566 + arg0);
               this.field7750.method3607(arg1 + var6, -var10 + arg0 + super.field4464.field6566, -var6 - var8 + super.field4464.field6555, super.field4464.field6566);
               class444.field6473.method333(var5[0], var5[1], var5[2], var5[3]);
            }
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field7761[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(I)V",
      line = 262
   )
   public final void method61(int arg0) {
      try {
         ++field7751;
         super.method61(arg0);
         class411 var2 = (class411)super.field4464;
         this.field7753 = class208.method1771(var2.field6027, super.field4479, arg0 + 15261);
         this.field7758 = class208.method1771(var2.field6020, super.field4479, -113);
         this.field7747 = class208.method1771(var2.field6019, super.field4479, arg0 + 15242);
         this.field7748 = class208.method1771(var2.field6018, super.field4479, -90);
         this.field7752 = class208.method1771(var2.field6021, super.field4479, arg0 ^ 15452);
         this.field7750 = class208.method1771(var2.field6024, super.field4479, arg0 + 15284);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7761[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "<init>",
      descriptor = "(Lhw;Lhw;Lbr;)V",
      line = 280
   )
   public class532(class141 arg0, class141 arg1, class411 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!mq",
      name = "b",
      descriptor = "(ZI)Ljfa;",
      line = 284
   )
   public static final class303 method3986(boolean arg0, int arg1) {
      try {
         ++field7755;
         int var2 = arg1 >> 16;
         int var3 = 65535 & arg1;
         if (class253.field3608[var2] == null || class253.field3608[var2][var3] == null) {
            boolean var4 = class28.method199(0, var2);
            if (!var4) {
               return null;
            }
         }

         return !arg0 ? null : class253.field3608[var2][var3];
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7761[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3987(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3988(char[] arg0) {
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
            var10005 = 46;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
