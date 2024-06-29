import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class277 {
   @OriginalMember(
      owner = "client!os",
      name = "o",
      descriptor = "Lsia;"
   )
   private class407 field3531 = new class407(64);
   @OriginalMember(
      owner = "client!os",
      name = "e",
      descriptor = "I"
   )
   public int field3544 = 0;
   @OriginalMember(
      owner = "client!os",
      name = "l",
      descriptor = "Lww;"
   )
   private class339 field3532;
   @OriginalMember(
      owner = "client!os",
      name = "f",
      descriptor = "I"
   )
   public int field3530;
   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3545 = new String[]{method2193(method2192("\u001e6Ec")), method2193(method2192("\u000bm\u0007!Q")), method2193(method2192("\u001f0\u0007L\u0004")), method2193(method2192("\u001f0\u0007I\u0004")), method2193(method2192("\u001f0\u0007J\u0004")), method2193(method2192("\u001f0\u0007M\u0004")), method2193(method2192("\u001f0\u00073E\u001e*]1\u0004")), method2193(method2192("\u001f0\u0007N\u0004")), method2193(method2192("\u001f0\u0007H\u0004")), method2193(method2192("\u001f0\u0007K\u0004"))};
   @OriginalMember(
      owner = "client!os",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field3534 = new int[1024];
   @OriginalMember(
      owner = "client!os",
      name = "n",
      descriptor = "Laka;"
   )
   public static class418 field3537 = new class418(32, 0);
   @OriginalMember(
      owner = "client!os",
      name = "j",
      descriptor = "I"
   )
   public static int field3541 = -1;
   @OriginalMember(
      owner = "client!os",
      name = "k",
      descriptor = "Lse;"
   )
   public static class6 field3543 = new class6(80, 3);
   @OriginalMember(
      owner = "client!os",
      name = "d",
      descriptor = "I"
   )
   public static int field3533;
   @OriginalMember(
      owner = "client!os",
      name = "g",
      descriptor = "I"
   )
   public static int field3535;
   @OriginalMember(
      owner = "client!os",
      name = "i",
      descriptor = "I"
   )
   public static int field3536;
   @OriginalMember(
      owner = "client!os",
      name = "c",
      descriptor = "I"
   )
   public static int field3538;
   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "I"
   )
   public static int field3539;
   @OriginalMember(
      owner = "client!os",
      name = "m",
      descriptor = "I"
   )
   public static int field3540;
   @OriginalMember(
      owner = "client!os",
      name = "h",
      descriptor = "I"
   )
   public static int field3542;

   @OriginalMember(
      owner = "client!os",
      name = "b",
      descriptor = "(II)Led;"
   )
   public final class628 method2185(int arg0, int arg1) {
      try {
         ++field3538;
         class407 var3 = this.field3531;
         class628 var4;
         synchronized(this.field3531) {
            var4 = (class628)this.field3531.method3192((long)arg0, (byte)-125);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field3532;
            byte[] var6;
            synchronized(this.field3532) {
               var6 = this.field3532.method2697(arg0, 4, false);
            }

            class628 var7 = new class628();
            var7.field9280 = arg0;
            var7.field9273 = this;
            if (var6 != null) {
               var7.method4645(-105, new class66(var6));
            }

            var7.method4647((byte)26);
            class407 var8 = this.field3531;
            synchronized(this.field3531) {
               this.field3531.method3190(var7, (long)arg0, arg1 ^ 19986);
            }

            if (arg1 != 19994) {
               method2186(-12);
            }

            return var7;
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field3545[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2186(int arg0) {
      try {
         field3543 = null;
         if (arg0 != -97) {
            method2186(-43);
         }

         field3537 = null;
         field3534 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3545[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2187(int arg0, int arg1) {
      try {
         ++field3533;
         class407 var3 = this.field3531;
         synchronized(this.field3531) {
            this.field3531.method3197(5, arg1);
         }

         if (arg0 >= -35) {
            field3534 = null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3545[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(BLjava/lang/String;)J"
   )
   public static final long method2188(byte arg0, String arg1) {
      boolean var2 = client.field1481;

      try {
         ++field3540;
         long var3 = 0L;
         int var5 = arg1.length();
         int var6 = 0;
         if (arg0 != -87) {
            return -71L;
         } else {
            long var10000;
            label87:
            while(true) {
               label94: {
                  if (var6 >= var5) {
                     if (!var2) {
                        if (var2) {
                           var3 /= 37L;
                        }
                        break label94;
                     }
                  } else {
                     var3 *= 37L;
                  }

                  label103: {
                     char var7 = arg1.charAt(var6);
                     if (~var7 <= -66 && var7 <= 'Z') {
                        var3 += (long)(var7 + 1 + -65);
                        if (!var2) {
                           break label103;
                        }
                     }

                     if (~var7 > -98 || var7 > 'z') {
                        if (~var7 > -49 || ~var7 < -58) {
                           break label103;
                        }

                        var3 += (long)(27 - -var7 + -48);
                        if (!var2) {
                           break label103;
                        }
                     }

                     var3 += (long)(var7 + 1 + -97);
                  }

                  if (var3 < 177917621779460413L || var2) {
                     ++var6;
                     continue;
                  }
               }

               while(true) {
                  if (var3 % 37L != 0L) {
                     break label87;
                  }

                  var10000 = ~var3;
                  if (var2) {
                     return var10000;
                  }

                  if (var10000 == -1L) {
                     break label87;
                  }

                  var3 /= 37L;
               }
            }

            var10000 = var3;
            return var10000;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field3545[2] + arg0 + ',' + (arg1 != null ? field3545[1] : field3545[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method2189(int arg0, byte arg1, int arg2) {
      try {
         ++field3536;
         if (arg1 != -123) {
            return false;
         } else {
            return (540800 & arg2) != 0;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3545[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method2190(boolean arg0) {
      try {
         if (arg0) {
            this.method2191((byte)-73);
         }

         class407 var2 = this.field3531;
         synchronized(this.field3531) {
            this.field3531.method3201((byte)96);
         }

         ++field3535;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3545[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2191(byte arg0) {
      try {
         class407 var2 = this.field3531;
         synchronized(this.field3531) {
            this.field3531.method3187(-23825);
            if (arg0 < 13) {
               this.method2185(49, 41);
            }
         }

         ++field3539;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3545[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class277(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field3532 = arg2;
         this.field3530 = this.field3532.method2691(4, 127);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3545[6] + (arg0 != null ? field3545[1] : field3545[0]) + ',' + arg1 + ',' + (arg2 != null ? field3545[1] : field3545[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2192(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!os",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2193(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
