import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class604 {
   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8887 = new String[]{method4417(method4416("\\y9\u0001Z\u001d")), method4417(method4416("[y{.")), method4417(method4416("N\"9le")), method4417(method4416("\\y9\u0006Z\u001d")), method4417(method4416("\\y9\u0007Z\u001d")), method4417(method4416("\\y9\u0004Z\u001d"))};
   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "Lsda;"
   )
   public static class269 field8880 = new class269(44, 3);
   @OriginalMember(
      owner = "client!iu",
      name = "g",
      descriptor = "I"
   )
   public static int field8879;
   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "I"
   )
   public static int field8883;
   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "I"
   )
   public static int field8884;
   @OriginalMember(
      owner = "client!iu",
      name = "h",
      descriptor = "Leaa;"
   )
   public static class526 field8882;
   @OriginalMember(
      owner = "client!iu",
      name = "f",
      descriptor = "Liu;"
   )
   public class604 field8881;
   @OriginalMember(
      owner = "client!iu",
      name = "e",
      descriptor = "Liu;"
   )
   public class604 field8886;
   @OriginalMember(
      owner = "client!iu",
      name = "d",
      descriptor = "[Lida;"
   )
   public static class246[] field8885;

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(IB[Lhv;)V",
      line = 3
   )
   public static final void method4412(int arg0, byte arg1, class544[] arg2) {
      int var3 = client.field4530;

      try {
         ++field8883;
         if (arg1 != 98) {
            field8882 = null;
         }

         int var4 = 0;
         if (var3 != 0 || var4 < arg2.length) {
            do {
               class544 var5 = arg2[var4];
               if (var5 != null && ~var5.field7968 == ~arg0 && !client.method2379(var5)) {
                  if (~var5.field7920 == -1) {
                     method4412(var5.field8054, (byte)98, arg2);
                     if (var5.field8061 != null) {
                        method4412(var5.field8054, (byte)98, var5.field8061);
                     }

                     class624 var6 = (class624)class573.field8525.method5681((long)var5.field8054, -1);
                     if (var6 != null) {
                        class169.method1362(var6.field9087, (byte)-119);
                     }
                  }

                  if (var5.field7920 == 6 && ~var5.field7944 != 0) {
                     class676 var7 = class576.field8554.method3189(var5.field7944, (byte)-37);
                     if (var7 != null) {
                        label136: {
                           var5.field7936 += class65.field800;
                           int var8 = var5.field7989;
                           int var10000;
                           int var10001;
                           if (var3 != 0) {
                              var5.field7936 -= var7.field10151[var5.field7989];
                              ++var5.field7989;
                              var10000 = ~var5.field7989;
                              var10001 = ~var7.field10165.length;
                           } else if (var5.field7936 <= var7.field10151[var5.field7989]) {
                              var10000 = ~var5.field7989;
                              var10001 = ~var8;
                              if (var3 == 0) {
                                 if (var10000 != var10001) {
                                    class324.method2447(var5.field7989, 255, var7);
                                 }
                                 break label136;
                              }
                           } else {
                              var5.field7936 -= var7.field10151[var5.field7989];
                              ++var5.field7989;
                              var10000 = ~var5.field7989;
                              var10001 = ~var7.field10165.length;
                           }

                           while(true) {
                              if (var10000 <= var10001) {
                                 var5.field7989 -= var7.field10179;
                                 if (var5.field7989 >= 0) {
                                    if (~var5.field7989 <= ~var7.field10165.length) {
                                       var5.field7989 = 0;
                                    }
                                 } else {
                                    var5.field7989 = 0;
                                 }
                              }

                              var5.field7972 = var5.field7989 + 1;
                              if (var5.field7972 >= var7.field10165.length) {
                                 var5.field7972 -= var7.field10179;
                                 if (~var5.field7972 <= -1) {
                                    if (var7.field10165.length <= var5.field7972) {
                                       var5.field7972 = -1;
                                    }
                                 } else {
                                    var5.field7972 = -1;
                                 }
                              }

                              class140.method1188(var5, (byte)-110);
                              if (var5.field7936 <= var7.field10151[var5.field7989]) {
                                 var10000 = ~var5.field7989;
                                 var10001 = ~var8;
                                 if (var3 == 0) {
                                    if (var10000 != var10001) {
                                       class324.method2447(var5.field7989, 255, var7);
                                    }
                                    break;
                                 }
                              } else {
                                 var5.field7936 -= var7.field10151[var5.field7989];
                                 ++var5.field7989;
                                 var10000 = ~var5.field7989;
                                 var10001 = ~var7.field10165.length;
                              }
                           }
                        }
                     }
                  }
               }

               ++var4;
            } while(var4 < arg2.length);

         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field8887[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8887[2] : field8887[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(B)V",
      line = 98
   )
   public final void method4413(byte arg0) {
      try {
         ++field8879;
         if (this.field8881 != null) {
            this.field8881.field8886 = this.field8886;
            this.field8886.field8881 = this.field8881;
            if (arg0 > 2) {
               this.field8881 = null;
               this.field8886 = null;
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8887[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Lln;I)I",
      line = 118
   )
   public static final int method4414(class397 arg0, int arg1) {
      try {
         int var2 = 103 % ((arg1 - -52) / 46);
         ++field8884;
         if (arg0.field6104 == 0) {
            return 0;
         } else {
            if (arg0.field6048 != -1) {
               class397 var3 = null;
               if (~arg0.field6048 <= -32769) {
                  if (~arg0.field6048 <= -32769) {
                     var3 = class661.field9578[arg0.field6048 - 32768];
                  }
               } else {
                  class726 var4 = (class726)class259.field3509.method5681((long)arg0.field6048, -1);
                  if (var4 != null) {
                     var3 = var4.field10794;
                  }
               }

               if (var3 != null) {
                  int var5 = -var3.field9003 + arg0.field9003;
                  int var6 = arg0.field9007 - var3.field9007;
                  if (var5 != 0 || var6 != 0) {
                     arg0.method3045(16383 & (int)(2607.5945876176133D * Math.atan2((double)var5, (double)var6)), -18952);
                  }
               }
            }

            if (!(arg0 instanceof class687)) {
               if (!(arg0 instanceof class155)) {
                  return arg0.method3054((byte)-91);
               }

               class155 var7 = (class155)arg0;
               if (var7.field1961 == -1 || var7.field6121 != 0 && ~var7.field6123 >= -1) {
                  return arg0.method3054((byte)-91);
               }

               int var8 = -((-class718.field10676 + var7.field1961 + -class718.field10676) * 256) + var7.field9003;
               int var9 = -((var7.field1973 - class669.field10064 + -class669.field10064) * 256) + var7.field9007;
               if (~var8 != -1 || var9 != 0) {
                  var7.method3045(16383 & (int)(2607.5945876176133D * Math.atan2((double)var8, (double)var9)), -18952);
               }

               var7.field1961 = -1;
               if (client.field4530 == 0) {
                  return arg0.method3054((byte)-91);
               }
            }

            class687 var10 = (class687)arg0;
            if (var10.field10321 != -1 && (var10.field6121 == 0 || ~var10.field6123 < -1)) {
               var10.method3045(var10.field10321, -18952);
               var10.field10321 = -1;
            }

            return arg0.method3054((byte)-91);
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field8887[4] + (arg0 != null ? field8887[2] : field8887[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(B)V",
      line = 202
   )
   public static void method4415(byte arg0) {
      try {
         field8885 = null;
         field8882 = null;
         field8880 = null;
         if (arg0 > -79) {
            field8885 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8887[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4416(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4417(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
