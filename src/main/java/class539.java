import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class539 extends class37 {
   @OriginalMember(
      owner = "client!nga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7874 = new String[]{method4001(method4000("\\@uvi\u001a")), method4001(method4000("\\@uvj\u001a"))};
   @OriginalMember(
      owner = "client!nga",
      name = "e",
      descriptor = "I"
   )
   public static int field7872;
   @OriginalMember(
      owner = "client!nga",
      name = "f",
      descriptor = "Leaa;"
   )
   public static class526 field7873;

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(IIIII)V",
      line = 5
   )
   public static final void method3998(int arg0, int arg1, int arg2, int arg3, int arg4) {
      int var5 = client.field4530;

      try {
         class552 var6 = (class552)class256.field3455.method4071((byte)127);
         if (var5 != 0) {
            class201.method1548(var6, arg4, arg1, arg2, 0, arg3);
            var6 = (class552)class256.field3455.method4059((byte)123);
         }

         while(true) {
            while(var6 != null) {
               class201.method1548(var6, arg4, arg1, arg2, 0, arg3);
               var6 = (class552)class256.field3455.method4059((byte)123);
            }

            int var7 = -67 % ((-8 - arg0) / 53);
            ++field7872;
            class552 var8 = (class552)class33.field359.method4071((byte)127);
            if (var5 == 0) {
               if (var5 != 0 || var8 != null) {
                  do {
                     byte var9;
                     label245: {
                        var9 = 1;
                        class283 var10 = var8.field8172.method3052(20733);
                        if (~var8.field8172.field6078 == 0 || var8.field8172.field6106) {
                           var9 = 0;
                           if (var5 == 0) {
                              break label245;
                           }
                        }

                        if (var8.field8172.field6078 != var10.field3959 && ~var8.field8172.field6078 != ~var10.field3964 && ~var8.field8172.field6078 != ~var10.field3942 && ~var8.field8172.field6078 != ~var10.field3960) {
                           if (~var8.field8172.field6078 != ~var10.field3950 && var8.field8172.field6078 != var10.field3938 && ~var8.field8172.field6078 != ~var10.field3977 && var8.field8172.field6078 != var10.field3949) {
                              break label245;
                           }

                           var9 = 3;
                           if (var5 == 0) {
                              break label245;
                           }
                        }

                        var9 = 2;
                     }

                     if (~var8.field8180 != ~var9) {
                        label246: {
                           int var11 = class168.method1356(var8.field8172, 0);
                           class369 var12 = var8.field8172.field1971;
                           if (var12.field5590 != null) {
                              var12 = var12.method2872(true, class597.field8793);
                           }

                           if (var12 == null || ~var11 == 0) {
                              var8.field8169 = -1;
                              var8.field8180 = var9;
                              var8.field8163 = false;
                              if (var5 == 0) {
                                 break label246;
                              }
                           }

                           if (~var8.field8169 == ~var11 && var8.field8163 != !var12.field5609) {
                              var8.field8180 = var9;
                              var8.field8170 = var12.field5563;
                              if (var5 == 0) {
                                 break label246;
                              }
                           }

                           boolean var13;
                           label144: {
                              var13 = false;
                              if (var8.field8176 == null) {
                                 var13 = true;
                                 if (var5 == 0) {
                                    break label144;
                                 }
                              }

                              var8.field8170 -= 512;
                              if (var8.field8170 <= 0) {
                                 class149.field1871.method5585(var8.field8176);
                                 var8.field8176 = null;
                                 var13 = true;
                              }
                           }

                           if (var13) {
                              var8.field8163 = var12.field5609;
                              var8.field8170 = var12.field5563;
                              var8.field8184 = null;
                              var8.field8186 = null;
                              var8.field8180 = var9;
                              var8.field8169 = var11;
                           }
                        }
                     }

                     var8.field8179 = var8.field8172.field9003;
                     var8.field8183 = var8.field8172.field9003 - -(var8.field8172.method3046(125) << 8);
                     var8.field8164 = var8.field8172.field9007;
                     var8.field8192 = var8.field8172.field9007 + (var8.field8172.method3046(119) << 8);
                     class201.method1548(var8, arg4, arg1, arg2, 0, arg3);
                     var8 = (class552)class33.field359.method4059((byte)-53);
                  } while(var8 != null);
               }

               class552 var14 = (class552)class450.field6839.method5677((byte)44);
               if (var5 == 0 && var14 == null) {
                  return;
               }

               do {
                  byte var15;
                  label249: {
                     var15 = 1;
                     class283 var16 = var14.field8196.method3052(20733);
                     if (~var14.field8196.field6078 == 0 || var14.field8196.field6106) {
                        var15 = 0;
                        if (var5 == 0) {
                           break label249;
                        }
                     }

                     if (var14.field8196.field6078 == var16.field3959 || var14.field8196.field6078 == var16.field3964 || ~var14.field8196.field6078 == ~var16.field3942 || var14.field8196.field6078 == var16.field3960) {
                        var15 = 2;
                        if (var5 == 0) {
                           break label249;
                        }
                     }

                     if (var14.field8196.field6078 == var16.field3950 || var14.field8196.field6078 == var16.field3938 || var14.field8196.field6078 == var16.field3977 || var14.field8196.field6078 == var16.field3949) {
                        var15 = 3;
                     }
                  }

                  if (var14.field8180 != var15) {
                     label248: {
                        int var17 = class555.method4107(var14.field8196, -125);
                        if (var14.field8169 != var17 || var14.field8196.field10331 != var14.field8163) {
                           boolean var18;
                           label194: {
                              var18 = false;
                              if (var14.field8176 == null) {
                                 var18 = true;
                                 if (var5 == 0) {
                                    break label194;
                                 }
                              }

                              var14.field8170 -= 512;
                              if (~var14.field8170 >= -1) {
                                 class149.field1871.method5585(var14.field8176);
                                 var18 = true;
                                 var14.field8176 = null;
                              }
                           }

                           if (!var18) {
                              break label248;
                           }

                           var14.field8186 = null;
                           var14.field8184 = null;
                           var14.field8163 = var14.field8196.field10331;
                           var14.field8169 = var17;
                           var14.field8180 = var15;
                           var14.field8170 = var14.field8196.field10326;
                           if (var5 == 0) {
                              break label248;
                           }
                        }

                        var14.field8170 = var14.field8196.field10326;
                        var14.field8180 = var15;
                     }
                  }

                  var14.field8179 = var14.field8196.field9003;
                  var14.field8183 = var14.field8196.field9003 + (var14.field8196.method3046(-8) << 8);
                  var14.field8164 = var14.field8196.field9007;
                  var14.field8192 = var14.field8196.field9007 + (var14.field8196.method3046(99) << 8);
                  class201.method1548(var14, arg4, arg1, arg2, 0, arg3);
                  var14 = (class552)class450.field6839.method5671(-112);
               } while(var14 != null);

               return;
            }

            var6 = (class552)class256.field3455.method4059((byte)123);
         }
      } catch (RuntimeException var20) {
         throw class670.method4877(var20, field7874[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(Z)V",
      line = 179
   )
   public static void method3999(boolean arg0) {
      try {
         if (!arg0) {
            field7873 = null;
         }

         field7873 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7874[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4000(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4001(char[] arg0) {
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
            var10005 = 39;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
