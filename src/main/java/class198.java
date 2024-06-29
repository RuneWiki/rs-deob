import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class198 {
   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "Ltv;"
   )
   private class590 field2391 = new class590(64);
   @OriginalMember(
      owner = "client!c",
      name = "e",
      descriptor = "Ltv;"
   )
   public class590 field2399 = new class590(60);
   @OriginalMember(
      owner = "client!c",
      name = "f",
      descriptor = "Lqh;"
   )
   public class74 field2395;
   @OriginalMember(
      owner = "client!c",
      name = "l",
      descriptor = "Lqh;"
   )
   private class74 field2394;
   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2401 = new String[]{method1491(method1490("aFqm")), method1491(method1490("aFum")), method1491(method1490("aF\u000b,-k\u001c\tm")), method1491(method1490("l\u001d[)")), method1491(method1490("yF\u0019k>")), method1491(method1490("aFvm")), method1491(method1490("K\u0006A$/k\f\u00177\"f\u0001O\u007f")), method1491(method1490("aFtm")), method1491(method1490("aFpm")), method1491(method1490("aFrm")), method1491(method1490("aFsm"))};
   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "Lnw;"
   )
   public static class616 field2397 = new class616(86, 7);
   @OriginalMember(
      owner = "client!c",
      name = "j",
      descriptor = "I"
   )
   public static int field2389;
   @OriginalMember(
      owner = "client!c",
      name = "g",
      descriptor = "I"
   )
   public static int field2390;
   @OriginalMember(
      owner = "client!c",
      name = "h",
      descriptor = "I"
   )
   public static int field2392;
   @OriginalMember(
      owner = "client!c",
      name = "k",
      descriptor = "I"
   )
   public static int field2393;
   @OriginalMember(
      owner = "client!c",
      name = "c",
      descriptor = "I"
   )
   public static int field2396;
   @OriginalMember(
      owner = "client!c",
      name = "d",
      descriptor = "I"
   )
   public static int field2398;
   @OriginalMember(
      owner = "client!c",
      name = "i",
      descriptor = "I"
   )
   public int field2400;

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method1483(byte arg0) {
      try {
         ++field2398;
         class590 var2 = this.field2391;
         synchronized(this.field2391) {
            this.field2391.method4244(true);
            if (arg0 != -84) {
               this.method1484(70, -49);
            }
         }

         class590 var3 = this.field2399;
         synchronized(this.field2399) {
            this.field2399.method4244(true);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2401[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1484(int arg0, int arg1) {
      try {
         ++field2390;
         class590 var3 = this.field2391;
         synchronized(this.field2391) {
            this.field2391.method4234(2, arg0);
         }

         class590 var4 = this.field2399;
         synchronized(this.field2399) {
            this.field2399.method4234(2, arg0);
            if (arg1 != 7464) {
               this.field2400 = -52;
            }

         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2401[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1485(int arg0) {
      try {
         if (arg0 != -23773) {
            field2397 = null;
         }

         field2397 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2401[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(II)Llaa;"
   )
   public final class130 method1486(int arg0, int arg1) {
      try {
         ++field2389;
         class590 var3 = this.field2391;
         class130 var4;
         synchronized(this.field2391) {
            var4 = (class130)this.field2391.method4239((long)arg0, 0);
            if (arg1 != 87) {
               this.field2391 = null;
            }
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field2394;
            byte[] var6;
            synchronized(this.field2394) {
               var6 = this.field2394.method732(class243.method1821(arg0, arg1 ^ 85), class775.method5558(arg0, -107), (byte)45);
            }

            class130 var7 = new class130();
            var7.field1640 = this;
            var7.field1638 = arg0;
            if (var6 != null) {
               var7.method1081(new class594(var6), (byte)-98);
            }

            class590 var8 = this.field2391;
            synchronized(this.field2391) {
               this.field2391.method4238(arg1 + -58, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field2401[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1487(byte arg0) {
      try {
         if (arg0 >= -59) {
            field2397 = null;
         }

         ++field2393;
         class590 var2 = this.field2391;
         synchronized(this.field2391) {
            this.field2391.method4245(true);
         }

         class590 var3 = this.field2399;
         synchronized(this.field2399) {
            this.field2399.method4245(true);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2401[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IZII)Ljava/lang/String;"
   )
   public static final String method1488(int arg0, boolean arg1, int arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         ++field2396;
         if (~arg0 <= -3 && ~arg0 >= -37) {
            if (arg1 && ~arg3 <= -1) {
               int var5 = 2;
               int var6 = arg3 / arg0;
               if (var4) {
                  var6 /= arg0;
                  ++var5;
               }

               while(true) {
                  while(~var6 != -1) {
                     var6 /= arg0;
                     ++var5;
                  }

                  char[] var7 = new char[var5];
                  var7[0] = '+';
                  int var8 = arg2 + var5;
                  if (!var4) {
                     if (!var4 && ~var8 >= -1) {
                        return new String(var7);
                     } else {
                        do {
                           int var9 = arg3;
                           arg3 /= arg0;
                           int var10 = -(arg0 * arg3) + var9;
                           if (var10 < 10) {
                              var7[var8] = (char)(var10 + 48);
                              if (var4) {
                                 var7[var8] = (char)(var10 + 87);
                                 --var8;
                              } else {
                                 --var8;
                              }
                           } else {
                              var7[var8] = (char)(var10 + 87);
                              --var8;
                           }
                        } while(~var8 < -1);

                        return new String(var7);
                     }
                  }

                  ++var5;
               }
            } else {
               return Integer.toString(arg3, arg0);
            }
         } else {
            throw new IllegalArgumentException(field2401[6] + arg0);
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field2401[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method1489(int arg0, byte arg1) {
      try {
         ++field2392;
         this.field2400 = arg0;
         if (arg1 == 117) {
            class590 var3 = this.field2399;
            synchronized(this.field2399) {
               this.field2399.method4245(true);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2401[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "<init>",
      descriptor = "(Lnc;ILqh;Lqh;)V"
   )
   public class198(class26 arg0, int arg1, class74 arg2, class74 arg3) {
      try {
         this.field2395 = arg3;
         this.field2394 = arg2;
         int var5 = -1 + this.field2394.method719(true);
         this.field2394.method727(var5, -32767);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2401[2] + (arg0 != null ? field2401[4] : field2401[3]) + ',' + arg1 + ',' + (arg2 != null ? field2401[4] : field2401[3]) + ',' + (arg3 != null ? field2401[4] : field2401[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1490(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1491(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
