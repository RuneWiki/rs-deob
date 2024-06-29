import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class282 {
   @OriginalMember(
      owner = "client!pc",
      name = "s",
      descriptor = "Llja;"
   )
   private class728 field3914;
   @OriginalMember(
      owner = "client!pc",
      name = "h",
      descriptor = "I"
   )
   private int field3915;
   @OriginalMember(
      owner = "client!pc",
      name = "d",
      descriptor = "I"
   )
   private int field3910;
   @OriginalMember(
      owner = "client!pc",
      name = "f",
      descriptor = "Lhv;"
   )
   private class227 field3911;
   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3924 = new String[]{method2310(method2309("c}KBs")), method2310(method2309("h0K+&")), method2310(method2309("c}KDs")), method2310(method2309("}k\ti")), method2310(method2309("c}KMs")), method2310(method2309("c}KNs")), method2310(method2309("` \u0006v")), method2310(method2309("c}KOs")), method2310(method2309("c}K@s")), method2310(method2309("c}KCs")), method2310(method2309("c}KAs")), method2310(method2309("c}K92}w\u0011;s")), method2310(method2309("c}KLs")), method2310(method2309("c}KFs")), method2310(method2309("c}KGs"))};
   @OriginalMember(
      owner = "client!pc",
      name = "c",
      descriptor = "Laka;"
   )
   public static class418 field3913 = new class418(86, -1);
   @OriginalMember(
      owner = "client!pc",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field3916 = false;
   @OriginalMember(
      owner = "client!pc",
      name = "j",
      descriptor = "Laka;"
   )
   public static class418 field3920 = new class418(113, -1);
   @OriginalMember(
      owner = "client!pc",
      name = "r",
      descriptor = "I"
   )
   public static int field3921 = 100;
   @OriginalMember(
      owner = "client!pc",
      name = "g",
      descriptor = "I"
   )
   public static int field3905;
   @OriginalMember(
      owner = "client!pc",
      name = "i",
      descriptor = "I"
   )
   public static int field3906;
   @OriginalMember(
      owner = "client!pc",
      name = "b",
      descriptor = "I"
   )
   public static int field3907;
   @OriginalMember(
      owner = "client!pc",
      name = "n",
      descriptor = "I"
   )
   public static int field3908;
   @OriginalMember(
      owner = "client!pc",
      name = "q",
      descriptor = "I"
   )
   public static int field3909;
   @OriginalMember(
      owner = "client!pc",
      name = "e",
      descriptor = "I"
   )
   public static int field3912;
   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "I"
   )
   public static int field3917;
   @OriginalMember(
      owner = "client!pc",
      name = "p",
      descriptor = "I"
   )
   public static int field3918;
   @OriginalMember(
      owner = "client!pc",
      name = "l",
      descriptor = "I"
   )
   public static int field3919;
   @OriginalMember(
      owner = "client!pc",
      name = "m",
      descriptor = "I"
   )
   public static int field3922;
   @OriginalMember(
      owner = "client!pc",
      name = "k",
      descriptor = "I"
   )
   public static int field3923;

   @OriginalMember(
      owner = "client!pc",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method2298(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         ++field3919;
         class647 var3 = (class647)this.field3914.method5265(-127);
         boolean var10000;
         if (var2) {
            var10000 = var3.method545((byte)28);
         } else if (var3 == null) {
            var10000 = arg0;
            if (!var2) {
               if (arg0) {
                  this.method2298(false);
                  return;
               }

               return;
            }
         } else {
            var10000 = var3.method545((byte)28);
         }

         while(true) {
            if (var10000) {
               var3.method4924(-2970);
               var3.method125(13582);
               this.field3910 += var3.field9684;
            }

            var3 = (class647)this.field3914.method5266(false);
            if (var3 == null) {
               var10000 = arg0;
               if (!var2) {
                  if (arg0) {
                     this.method2298(false);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var3.method545((byte)28);
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3924[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "b",
      descriptor = "(ILwja;)V"
   )
   private final void method2299(int arg0, class352 arg1) {
      boolean var3 = client.field1481;

      try {
         ++field3905;
         long var4 = arg1.method1311(-109);
         class647 var6 = (class647)this.field3911.method1818(-1, var4);
         int var10000;
         if (var3) {
            var10000 = var6.field9681.method1309(arg1, (byte)-93);
         } else if (var6 == null) {
            var10000 = arg0;
            if (!var3) {
               if (arg0 != 14021) {
                  this.method2300(-45);
                  return;
               }

               return;
            }
         } else {
            var10000 = var6.field9681.method1309(arg1, (byte)-93);
         }

         do {
            while(true) {
               if (var10000 != 0) {
                  this.method2303((byte)118, var6);
                  if (!var3) {
                     var10000 = arg0;
                     break;
                  }

                  var6 = (class647)this.field3911.method1816((byte)118);
               } else {
                  var6 = (class647)this.field3911.method1816((byte)118);
               }

               if (var6 == null) {
                  var10000 = arg0;
                  if (!var3) {
                     if (arg0 != 14021) {
                        this.method2300(-45);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = var6.field9681.method1309(arg1, (byte)-93);
               }
            }
         } while(var3);

         if (arg0 != 14021) {
            this.method2300(-45);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3924[12] + arg0 + ',' + (arg1 != null ? field3924[1] : field3924[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2300(int arg0) {
      try {
         ++field3923;
         this.field3914.method5264(102);
         this.field3911.method1809(true);
         this.field3910 = this.field3915;
         if (arg0 < 82) {
            this.field3910 = -42;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3924[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2301(boolean arg0) {
      try {
         field3920 = null;
         field3913 = null;
         if (!arg0) {
            method2301(true);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3924[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method2302(byte arg0) {
      try {
         if (arg0 != -61) {
            return 58;
         } else {
            ++field3906;
            return this.field3915;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3924[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(BLgl;)V"
   )
   private final void method2303(byte arg0, class647 arg1) {
      try {
         if (arg0 != 118) {
            field3921 = 9;
         }

         ++field3918;
         if (arg1 != null) {
            arg1.method4924(arg0 + -3088);
            arg1.method125(13582);
            this.field3910 += arg1.field9684;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3924[2] + arg0 + ',' + (arg1 != null ? field3924[1] : field3924[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(IILjava/lang/Object;Lwja;)V"
   )
   private final void method2304(int arg0, int arg1, Object arg2, class352 arg3) {
      boolean var5 = client.field1481;

      try {
         ++field3907;
         if (~arg0 < ~this.field3915) {
            throw new IllegalStateException(field3924[6]);
         } else {
            this.method2299(14021, arg3);
            this.field3910 -= arg0;
            class647 var6;
            if (var5) {
               var6 = (class647)this.field3914.method5262(true);
               this.method2303((byte)118, var6);
            }

            while(true) {
               while(this.field3910 < 0) {
                  var6 = (class647)this.field3914.method5262(true);
                  this.method2303((byte)118, var6);
               }

               class275 var9 = new class275(arg3, arg2, arg0);
               this.field3911.method1808(arg3.method1311(-107), var9, 26459);
               if (!var5) {
                  if (arg1 >= -97) {
                     this.method2305(-91);
                  }

                  this.field3914.method5267((byte)122, var9);
                  var9.field275 = 0L;
                  return;
               }

               this.method2303((byte)118, var9);
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field3924[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3924[1] : field3924[3]) + ',' + (arg3 != null ? field3924[1] : field3924[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method2305(int arg0) {
      try {
         if (arg0 != 0) {
            return 39;
         } else {
            ++field3912;
            return this.field3910;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3924[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(ILwja;)Ljava/lang/Object;"
   )
   public final Object method2306(int arg0, class352 arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 != 0) {
            return null;
         } else {
            class647 var6;
            Object var7;
            label69: {
               ++field3909;
               long var4 = arg1.method1311(arg0 ^ -121);
               var6 = (class647)this.field3911.method1818(-1, var4);
               if (var3) {
                  if (var6.field9681.method1309(arg1, (byte)-87)) {
                     var7 = var6.method546((byte)-72);
                     if (var7 != null) {
                        break label69;
                     }

                     var6.method4924(arg0 ^ -2970);
                     var6.method125(13582);
                     this.field3910 += var6.field9684;
                     if (var3) {
                        break label69;
                     }
                  }

                  var6 = (class647)this.field3911.method1816((byte)0);
               }

               label68:
               while(true) {
                  while(var6 != null) {
                     if (var6.field9681.method1309(arg1, (byte)-87)) {
                        var7 = var6.method546((byte)-72);
                        if (var7 != null) {
                           break label68;
                        }

                        var6.method4924(arg0 ^ -2970);
                        var6.method125(13582);
                        this.field3910 += var6.field9684;
                        if (var3) {
                           break label68;
                        }
                     }

                     var6 = (class647)this.field3911.method1816((byte)0);
                  }

                  if (!var3) {
                     return null;
                  }

                  var6 = (class647)this.field3911.method1816((byte)0);
               }
            }

            if (var6.method545((byte)28)) {
               class275 var8 = new class275(arg1, var7, var6.field9684);
               this.field3911.method1808(var6.field9965, var8, arg0 ^ 26459);
               this.field3914.method5267((byte)117, var8);
               var8.field275 = 0L;
               var6.method4924(arg0 ^ -2970);
               var6.method125(arg0 ^ 13582);
               if (!var3) {
                  return var7;
               }
            }

            this.field3914.method5267((byte)108, var6);
            var6.field275 = 0L;
            return var7;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field3924[7] + arg0 + ',' + (arg1 != null ? field3924[1] : field3924[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2307(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field3922;
         if (class549.field8089 != null) {
            class647 var4 = (class647)this.field3914.method5265(-128);
            if (var3 || var4 != null) {
               do {
                  label41: {
                     if (var4.method545((byte)28)) {
                        if (var4.method546((byte)-72) != null) {
                           break label41;
                        }

                        var4.method4924(-2970);
                        var4.method125(13582);
                        this.field3910 += var4.field9684;
                        if (!var3) {
                           break label41;
                        }
                     }

                     if ((long)arg0 < ++var4.field275) {
                        class647 var5 = class549.field8089.method1036((byte)-97, var4);
                        this.field3911.method1808(var4.field9965, var5, 26459);
                        class412.method3233(var5, -93, var4);
                        var4.method4924(-2970);
                        var4.method125(13582);
                     }
                  }

                  var4 = (class647)this.field3914.method5266(false);
               } while(var4 != null);
            }
         }

         if (arg1 > -32) {
            this.method2306(44, (class352)null);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3924[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class282(int arg0) {
      boolean var2 = client.field1481;
      super();
      this.field3914 = new class728();

      try {
         this.field3915 = arg0;
         this.field3910 = arg0;
         int var3 = 1;
         if (var2) {
            var3 += var3;
         }

         while(~arg0 < ~(var3 + var3)) {
            var3 += var3;
         }

         this.field3911 = new class227(var3);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3924[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(ILwja;Ljava/lang/Object;)V"
   )
   public final void method2308(int arg0, class352 arg1, Object arg2) {
      try {
         ++field3908;
         this.method2304(1, -101, arg2, arg1);
         if (arg0 > -44) {
            this.method2303((byte)118, (class647)null);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3924[13] + arg0 + ',' + (arg1 != null ? field3924[1] : field3924[3]) + ',' + (arg2 != null ? field3924[1] : field3924[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2309(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2310(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
