import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class158 {
   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "Z"
   )
   public boolean field2345 = false;
   @OriginalMember(
      owner = "client!mfa",
      name = "h",
      descriptor = "Llj;"
   )
   private class304 field2340 = new class304(64);
   @OriginalMember(
      owner = "client!mfa",
      name = "g",
      descriptor = "Llj;"
   )
   public class304 field2350 = new class304(500);
   @OriginalMember(
      owner = "client!mfa",
      name = "e",
      descriptor = "Llj;"
   )
   public class304 field2351 = new class304(30);
   @OriginalMember(
      owner = "client!mfa",
      name = "y",
      descriptor = "Llj;"
   )
   public class304 field2352 = new class304(50);
   @OriginalMember(
      owner = "client!mfa",
      name = "f",
      descriptor = "Lrr;"
   )
   public class678 field2343;
   @OriginalMember(
      owner = "client!mfa",
      name = "x",
      descriptor = "Ltv;"
   )
   private class311 field2338;
   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "I"
   )
   private int field2332;
   @OriginalMember(
      owner = "client!mfa",
      name = "m",
      descriptor = "Lrr;"
   )
   private class678 field2337;
   @OriginalMember(
      owner = "client!mfa",
      name = "s",
      descriptor = "Z"
   )
   public boolean field2348;
   @OriginalMember(
      owner = "client!mfa",
      name = "l",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field2353;
   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2356 = new String[]{method1423(method1422("XEe\u0003d\u001d")), method1423(method1422("XEe\u0003m\u001d")), method1423(method1422("N\r*\u0003Q")), method1423(method1422("[VhA")), method1423(method1422("XEe\u0003g\u001d")), method1423(method1422("XEe\u0003n\u001d")), method1423(method1422("XEe\u0003f\u001d")), method1423(method1422("XEe\u0003k\u001d")), method1423(method1422("_I")), method1423(method1422("XEe\u0003i\u001d")), method1423(method1422("XEe\u0003h\u001d")), method1423(method1422("XEe\u0003\u0010\\MmY\u0012\u001d")), method1423(method1422("XEe\u0003j\u001d")), method1423(method1422("XEe\u0003o\u001d")), method1423(method1422("XEe\u0003e\u001d"))};
   @OriginalMember(
      owner = "client!mfa",
      name = "v",
      descriptor = "F"
   )
   public static float field2339 = 1.0F;
   @OriginalMember(
      owner = "client!mfa",
      name = "k",
      descriptor = "I"
   )
   public static int field2331;
   @OriginalMember(
      owner = "client!mfa",
      name = "w",
      descriptor = "I"
   )
   public static int field2333;
   @OriginalMember(
      owner = "client!mfa",
      name = "q",
      descriptor = "I"
   )
   public static int field2334;
   @OriginalMember(
      owner = "client!mfa",
      name = "i",
      descriptor = "I"
   )
   public static int field2335;
   @OriginalMember(
      owner = "client!mfa",
      name = "o",
      descriptor = "I"
   )
   public static int field2336;
   @OriginalMember(
      owner = "client!mfa",
      name = "c",
      descriptor = "I"
   )
   public static int field2341;
   @OriginalMember(
      owner = "client!mfa",
      name = "n",
      descriptor = "I"
   )
   public static int field2342;
   @OriginalMember(
      owner = "client!mfa",
      name = "d",
      descriptor = "I"
   )
   public static int field2344;
   @OriginalMember(
      owner = "client!mfa",
      name = "t",
      descriptor = "I"
   )
   public static int field2346;
   @OriginalMember(
      owner = "client!mfa",
      name = "j",
      descriptor = "I"
   )
   public static int field2347;
   @OriginalMember(
      owner = "client!mfa",
      name = "r",
      descriptor = "I"
   )
   public static int field2349;
   @OriginalMember(
      owner = "client!mfa",
      name = "p",
      descriptor = "I"
   )
   public int field2354;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!mfa",
      name = "u",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field2355;

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(BLjava/lang/String;)Z"
   )
   public static final boolean method1410(byte arg0, String arg1) {
      try {
         if (arg0 != -93) {
            field2339 = 0.45256004F;
         }

         ++field2344;
         return class243.method2067(field2355 != null ? field2355 : (field2355 = method1421(field2356[8])), arg1, 0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2356[7] + arg0 + ',' + (arg1 != null ? field2356[2] : field2356[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(II)Lru;"
   )
   public final class333 method1411(int arg0, int arg1) {
      try {
         ++field2334;
         class304 var3 = this.field2340;
         class333 var4;
         synchronized(this.field2340) {
            var4 = (class333)this.field2340.method2544(false, (long)arg0);
            if (arg1 >= -46) {
               this.field2337 = null;
            }
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field2337;
            byte[] var6;
            synchronized(this.field2337) {
               var6 = this.field2337.method5017(class375.method3075(arg0, 65535), class23.method171(arg0, (byte)90), (byte)71);
            }

            class333 var7 = new class333();
            var7.field5099 = arg0;
            var7.field5038 = this;
            var7.field5098 = (String[])this.field2353.clone();
            if (var6 != null) {
               var7.method2721((byte)23, new class354(var6));
            }

            var7.method2725((byte)-21);
            if (!this.field2348 && var7.field5086) {
               var7.field5057 = null;
               var7.field5098 = null;
            }

            if (var7.field5073) {
               var7.field5135 = false;
               var7.field5052 = 0;
            }

            class304 var8 = this.field2340;
            synchronized(this.field2340) {
               this.field2340.method2545((long)arg0, 119, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field2356[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(ILeh;)I"
   )
   public static final int method1412(int arg0, class19 arg1) {
      try {
         if (arg0 != 50) {
            field2339 = 1.4814662F;
         }

         ++field2335;
         if (class392.field6155 == arg1) {
            return 6407;
         } else if (class364.field5628 == arg1) {
            return 6408;
         } else if (class342.field5203 == arg1) {
            return 6406;
         } else if (class168.field2565 != arg1) {
            if (class681.field10155 == arg1) {
               return 6410;
            } else if (class40.field484 == arg1) {
               return 6145;
            } else {
               throw new IllegalStateException();
            }
         } else {
            return 6409;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2356[12] + arg0 + ',' + (arg1 != null ? field2356[2] : field2356[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1413(int arg0) {
      try {
         ++field2333;
         class304 var2 = this.field2340;
         synchronized(this.field2340) {
            this.field2340.method2554(-100);
         }

         class304 var3 = this.field2350;
         synchronized(this.field2350) {
            this.field2350.method2554(-105);
            if (arg0 != 30) {
               this.method1418(-64);
            }
         }

         class304 var4 = this.field2351;
         synchronized(this.field2351) {
            this.field2351.method2554(-118);
         }

         class304 var5 = this.field2352;
         synchronized(this.field2352) {
            this.field2352.method2554(-96);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field2356[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method1414(boolean arg0, int arg1) {
      try {
         ++field2341;
         int var3 = 53 % ((arg1 - 82) / 43);
         if (!this.field2348 == arg0) {
            this.field2348 = arg0;
            this.method1418(30);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field2356[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method1415(boolean arg0, boolean arg1) {
      try {
         ++field2342;
         if (arg0 == !this.field2345) {
            if (!arg1) {
               this.method1413(-50);
            }

            this.field2345 = arg0;
            this.method1418(30);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2356[14] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method1416(boolean arg0, int arg1) {
      try {
         this.field2340 = new class304(arg1);
         ++field2349;
         if (arg0) {
            this.method1418(43);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2356[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method1417(int arg0, int arg1) {
      try {
         ++field2336;
         class304 var3 = this.field2340;
         synchronized(this.field2340) {
            this.field2340.method2552(arg1, 21533);
         }

         class304 var4 = this.field2350;
         synchronized(this.field2350) {
            this.field2350.method2552(arg1, 21533);
         }

         class304 var5 = this.field2351;
         synchronized(this.field2351) {
            this.field2351.method2552(arg1, 21533);
         }

         class304 var6 = this.field2352;
         synchronized(this.field2352) {
            this.field2352.method2552(arg1, 21533);
            if (arg0 != 6407) {
               this.field2337 = null;
            }

         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field2356[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1418(int arg0) {
      try {
         class304 var2 = this.field2340;
         synchronized(this.field2340) {
            this.field2340.method2551(true);
         }

         ++field2331;
         if (arg0 == 30) {
            class304 var3 = this.field2350;
            synchronized(this.field2350) {
               this.field2350.method2551(true);
            }

            class304 var4 = this.field2351;
            synchronized(this.field2351) {
               this.field2351.method2551(true);
            }

            class304 var5 = this.field2352;
            synchronized(this.field2352) {
               this.field2352.method2551(true);
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field2356[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(ILmu;II[I[I)Lwf;"
   )
   public static final class153 method1419(int arg0, class258 arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
      boolean var6 = client.field1786;

      try {
         ++field2346;
         if (arg2 != 30455) {
            return null;
         } else if (!arg1.method1453(class342.field5203, class650.field9371, (byte)-111)) {
            int[] var11 = new int[arg0 * arg3];
            int var12 = 0;
            if (!var6 && ~arg0 >= ~var12) {
               return new class153(arg1, arg3, arg0, var11);
            } else {
               do {
                  int var13 = arg3 * var12 - -arg4[var12];
                  int var14 = 0;
                  if (var6) {
                     var11[var13++] = -16777216;
                     ++var14;
                  }

                  while(true) {
                     while(var14 < arg5[var12]) {
                        var11[var13++] = -16777216;
                        ++var14;
                     }

                     if (!var6) {
                        ++var12;
                        break;
                     }

                     ++var14;
                  }
               } while(~arg0 < ~var12);

               return new class153(arg1, arg3, arg0, var11);
            }
         } else {
            byte[] var7 = new byte[arg0 * arg3];
            int var8 = 0;
            if (!var6 && ~arg0 >= ~var8) {
               return new class153(arg1, arg3, arg0, var7);
            } else {
               do {
                  int var9 = arg3 * var8 + arg4[var8];
                  int var10 = 0;
                  if (var6) {
                     var7[var9++] = -1;
                     ++var10;
                  }

                  while(true) {
                     while(arg5[var8] > var10) {
                        var7[var9++] = -1;
                        ++var10;
                     }

                     if (!var6) {
                        ++var8;
                        break;
                     }

                     ++var10;
                  }
               } while(~arg0 < ~var8);

               return new class153(arg1, arg3, arg0, var7);
            }
         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field2356[4] + arg0 + ',' + (arg1 != null ? field2356[2] : field2356[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2356[2] : field2356[3]) + ',' + (arg5 != null ? field2356[2] : field2356[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method1420(int arg0, int arg1) {
      try {
         this.field2354 = arg1;
         ++field2347;
         if (arg0 != 0) {
            this.field2353 = null;
         }

         class304 var3 = this.field2350;
         synchronized(this.field2350) {
            this.field2350.method2551(true);
         }

         class304 var4 = this.field2351;
         synchronized(this.field2351) {
            this.field2351.method2551(true);
         }

         class304 var5 = this.field2352;
         synchronized(this.field2352) {
            this.field2352.method2551(true);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field2356[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "<init>",
      descriptor = "(Ltv;IZLrr;Lrr;)V"
   )
   public class158(class311 arg0, int arg1, boolean arg2, class678 arg3, class678 arg4) {
      try {
         this.field2343 = arg4;
         this.field2338 = arg0;
         this.field2332 = arg1;
         this.field2337 = arg3;
         this.field2348 = arg2;
         if (this.field2337 != null) {
            int var6 = -1 + this.field2337.method5008(-1);
            this.field2337.method4998((byte)-82, var6);
         }

         if (class619.field9004 == this.field2338) {
            this.field2353 = new String[]{null, null, null, null, null, class499.field7610.method3875(this.field2332, 102)};
         } else {
            this.field2353 = new String[]{null, null, null, null, null, null};
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2356[11] + (arg0 != null ? field2356[2] : field2356[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2356[2] : field2356[3]) + ',' + (arg4 != null ? field2356[2] : field2356[3]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1421(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1422(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1423(char[] arg0) {
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
            var10005 = 35;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
