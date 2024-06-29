import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class112 {
   @OriginalMember(
      owner = "client!qha",
      name = "j",
      descriptor = "Loi;"
   )
   private class80 field1407 = new class80(64);
   @OriginalMember(
      owner = "client!qha",
      name = "f",
      descriptor = "Loi;"
   )
   public class80 field1417 = new class80(2);
   @OriginalMember(
      owner = "client!qha",
      name = "i",
      descriptor = "Lkf;"
   )
   public class266 field1406;
   @OriginalMember(
      owner = "client!qha",
      name = "m",
      descriptor = "Lkf;"
   )
   private class266 field1413;
   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1418 = new String[]{method918(method917("h|\u0013Nv1")), method918(method917("h|\u0013Np1")), method918(method917("h|\u0013Ns1")), method918(method917("b:\\NJ")), method918(method917("wa\u001e\f")), method918(method917("h|\u0013Nq1")), method918(method917("h|\u0013Nt1")), method918(method917("h|\u0013Nu1")), method918(method917("h|\u0013N\u000bpz\u001b\u0014\t1")), method918(method917("h|\u0013Nr1"))};
   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field1408 = false;
   @OriginalMember(
      owner = "client!qha",
      name = "k",
      descriptor = "D"
   )
   public static double field1410 = -1.0D;
   @OriginalMember(
      owner = "client!qha",
      name = "b",
      descriptor = "I"
   )
   public static int field1405;
   @OriginalMember(
      owner = "client!qha",
      name = "c",
      descriptor = "I"
   )
   public static int field1409;
   @OriginalMember(
      owner = "client!qha",
      name = "g",
      descriptor = "I"
   )
   public static int field1411;
   @OriginalMember(
      owner = "client!qha",
      name = "d",
      descriptor = "I"
   )
   public static int field1412;
   @OriginalMember(
      owner = "client!qha",
      name = "l",
      descriptor = "I"
   )
   public static int field1414;
   @OriginalMember(
      owner = "client!qha",
      name = "e",
      descriptor = "I"
   )
   public static int field1415;
   @OriginalMember(
      owner = "client!qha",
      name = "h",
      descriptor = "I"
   )
   public static int field1416;

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(II)V",
      line = 5
   )
   public final void method910(int arg0, int arg1) {
      try {
         class80 var3 = this.field1407;
         synchronized(this.field1407) {
            this.field1407.method726(arg1, 25324);
         }

         if (arg0 != 0) {
            method912(12, -33, 85, 15, -16);
         }

         ++field1415;
         class80 var4 = this.field1417;
         synchronized(this.field1417) {
            this.field1417.method726(arg1, 25324);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1418[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(IZ)Ldka;",
      line = 22
   )
   public final class13 method911(int arg0, boolean arg1) {
      try {
         ++field1409;
         if (!arg1) {
            this.method915(-88);
         }

         class80 var3 = this.field1407;
         class13 var4;
         synchronized(this.field1407) {
            var4 = (class13)this.field1407.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field1413;
            byte[] var6;
            synchronized(this.field1413) {
               var6 = this.field1413.method2037(false, arg0, 33);
            }

            class13 var7 = new class13();
            var7.field150 = this;
            if (var6 != null) {
               var7.method77(new class147(var6), arg1);
            }

            class80 var8 = this.field1407;
            synchronized(this.field1407) {
               this.field1407.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field1418[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(IIIII)V",
      line = 55
   )
   public static final void method912(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field1416;
         if (arg0 != 0) {
            method912(117, -60, 101, 79, -61);
         }

         if (~class457.field6528 >= ~arg4 && arg4 <= class348.field4702) {
            int var8 = class298.method2224(arg3, class245.field3374, class699.field10237, arg0 ^ -250);
            int var7 = class298.method2224(arg1, class245.field3374, class699.field10237, -250);
            class117.method937(arg2, var8, arg4, 5473, var7);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1418[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "b",
      descriptor = "(I)V",
      line = 74
   )
   public final void method913(int arg0) {
      try {
         class80 var2 = this.field1407;
         synchronized(this.field1407) {
            this.field1407.method715(true);
         }

         if (arg0 <= -41) {
            ++field1405;
            class80 var3 = this.field1417;
            synchronized(this.field1417) {
               this.field1417.method715(true);
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1418[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(Lim;I)V",
      line = 90
   )
   public static final void method914(class598 arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field1414;
         boolean var3 = false;
         arg0.method693((byte)-125);
         class598 var4 = (class598)class265.field3654.method3488((byte)-125);
         boolean var10000;
         int var5;
         if (var2) {
            var10000 = class183.method1456(2, var4.method4350(32767), arg0.method4350(32767));
         } else if (var4 == null) {
            var10000 = var3;
            if (!var2) {
               if (!var3) {
                  class265.field3654.method3486(arg0, 1779380172);
               }

               var5 = -123 % ((-16 - arg1) / 38);
               return;
            }
         } else {
            var10000 = class183.method1456(2, var4.method4350(32767), arg0.method4350(32767));
         }

         do {
            while(true) {
               if (var10000) {
                  class102.method850(arg0, 118, var4);
                  var3 = true;
                  if (!var2) {
                     var10000 = var3;
                     break;
                  }

                  var4 = (class598)class265.field3654.method3484(0);
               } else {
                  var4 = (class598)class265.field3654.method3484(0);
               }

               if (var4 == null) {
                  var10000 = var3;
                  if (!var2) {
                     if (!var3) {
                        class265.field3654.method3486(arg0, 1779380172);
                     }

                     var5 = -123 % ((-16 - arg1) / 38);
                     return;
                  }
               } else {
                  var10000 = class183.method1456(2, var4.method4350(32767), arg0.method4350(32767));
               }
            }
         } while(var2);

         if (!var3) {
            class265.field3654.method3486(arg0, 1779380172);
         }

         var5 = -123 % ((-16 - arg1) / 38);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1418[7] + (arg0 != null ? field1418[3] : field1418[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(I)V",
      line = 126
   )
   public final void method915(int arg0) {
      try {
         ++field1411;
         class80 var2 = this.field1407;
         synchronized(this.field1407) {
            this.field1407.method731(0);
         }

         if (arg0 >= 118) {
            class80 var3 = this.field1417;
            synchronized(this.field1417) {
               this.field1417.method731(0);
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1418[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "a",
      descriptor = "(BLwf;)V",
      line = 151
   )
   public static final void method916(byte arg0, class147 arg1) {
      boolean var2 = client.field4360;

      try {
         ++field1412;
         int var3 = arg1.method1145((byte)125);
         class484.field6922 = new class451[var3];
         int var4 = 0;
         if (var2) {
            class484.field6922[var4] = new class451();
            class484.field6922[var4].field6389 = arg1.method1145((byte)48);
            class484.field6922[var4].field6390 = arg1.method1180((byte)82);
            ++var4;
         }

         while(true) {
            while(~var4 > ~var3) {
               class484.field6922[var4] = new class451();
               class484.field6922[var4].field6389 = arg1.method1145((byte)48);
               class484.field6922[var4].field6390 = arg1.method1180((byte)82);
               ++var4;
            }

            if (!var2) {
               if (arg0 != 22) {
                  method914((class598)null, -89);
               }

               class140.field1788 = arg1.method1145((byte)44);
               class33.field478 = arg1.method1145((byte)30);
               class152.field2145 = arg1.method1145((byte)26);
               class123.field1606 = new class503[-class140.field1788 + class33.field478 + 1];
               int var5 = 0;
               int var10000;
               if (var2) {
                  var10000 = arg1.method1145((byte)112);
               } else if (var5 >= class152.field2145) {
                  class367.field5026 = arg1.method1164(19693);
                  var10000 = 1;
                  if (!var2) {
                     class369.field5219 = true;
                     return;
                  }
               } else {
                  var10000 = arg1.method1145((byte)112);
               }

               while(true) {
                  int var6 = var10000;
                  class503 var7 = class123.field1606[var6] = new class503();
                  var7.field2311 = arg1.method1143(-15465);
                  var7.field2314 = arg1.method1164(19693);
                  var7.field7304 = class140.field1788 + var6;
                  var7.field7296 = arg1.method1180((byte)101);
                  var7.field7297 = arg1.method1180((byte)87);
                  ++var5;
                  if (var5 >= class152.field2145) {
                     class367.field5026 = arg1.method1164(19693);
                     var10000 = 1;
                     if (!var2) {
                        class369.field5219 = true;
                        return;
                     }
                  } else {
                     var10000 = arg1.method1145((byte)112);
                  }
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field1418[5] + arg0 + ',' + (arg1 != null ? field1418[3] : field1418[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "<init>",
      descriptor = "(Lno;ILkf;Lkf;)V",
      line = 209
   )
   public class112(class732 arg0, int arg1, class266 arg2, class266 arg3) {
      try {
         this.field1406 = arg3;
         this.field1413 = arg2;
         this.field1413.method2060(2, 33);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field1418[8] + (arg0 != null ? field1418[3] : field1418[4]) + ',' + arg1 + ',' + (arg2 != null ? field1418[3] : field1418[4]) + ',' + (arg3 != null ? field1418[3] : field1418[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method917(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method918(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
