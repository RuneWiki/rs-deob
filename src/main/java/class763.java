import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class763 {
   @OriginalMember(
      owner = "client!pg",
      name = "o",
      descriptor = "[B"
   )
   private byte[] field11210;
   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "I"
   )
   public int field11209;
   @OriginalMember(
      owner = "client!pg",
      name = "r",
      descriptor = "[[B"
   )
   private byte[][] field11216;
   @OriginalMember(
      owner = "client!pg",
      name = "m",
      descriptor = "I"
   )
   public int field11204;
   @OriginalMember(
      owner = "client!pg",
      name = "t",
      descriptor = "I"
   )
   public int field11206;
   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11221 = new String[]{method5535(method5534("=\u0005_{")), method5535(method5534(":\nK6")), method5535(method5534("7\u0007H?")), method5535(method5534("$\u000f\u0016\u0004\u001f")), method5535(method5534("8\u001c")), method5535(method5534(":\u001dT*")), method5535(method5534("3\u001c")), method5535(method5534("6\u001a")), method5535(method5534("/F\u0016hJ")), method5535(method5534("'\u0000A")), method5535(method5534("1\u001dJ)")), method5535(method5534("&\r_")), method5535(method5534(" \u0001U#D")), method5535(method5534("$\u000f\u0016\u0007\u001f")), method5535(method5534("$\u000f\u0016\f\u001f")), method5535(method5534("$\u000f\u0016z^:\u0001Lx\u001f")), method5535(method5534("$\u000f\u0016\u0000\u001f")), method5535(method5534("$\u000f\u0016\u0001\u001f")), method5535(method5534("$\u000f\u0016\r\u001f")), method5535(method5534("zF\u0016")), method5535(method5534("$\u000f\u0016\u0005\u001f")), method5535(method5534("$\u000f\u0016\u0003\u001f")), method5535(method5534("$\u000f\u0016\u000f\u001f")), method5535(method5534("$\u000f\u0016\n\u001f")), method5535(method5534("$\u000f\u0016\u000e\u001f")), method5535(method5534("$\u000f\u0016\u0002\u001f"))};
   @OriginalMember(
      owner = "client!pg",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field11211 = "";
   @OriginalMember(
      owner = "client!pg",
      name = "d",
      descriptor = "Lsd;"
   )
   public static class101 field11217 = new class101(18, 0);
   @OriginalMember(
      owner = "client!pg",
      name = "f",
      descriptor = "I"
   )
   public static int field11201;
   @OriginalMember(
      owner = "client!pg",
      name = "s",
      descriptor = "I"
   )
   public static int field11202;
   @OriginalMember(
      owner = "client!pg",
      name = "b",
      descriptor = "I"
   )
   public static int field11203;
   @OriginalMember(
      owner = "client!pg",
      name = "k",
      descriptor = "I"
   )
   public static int field11205;
   @OriginalMember(
      owner = "client!pg",
      name = "e",
      descriptor = "I"
   )
   public static int field11207;
   @OriginalMember(
      owner = "client!pg",
      name = "l",
      descriptor = "I"
   )
   public static int field11208;
   @OriginalMember(
      owner = "client!pg",
      name = "g",
      descriptor = "I"
   )
   public static int field11212;
   @OriginalMember(
      owner = "client!pg",
      name = "j",
      descriptor = "I"
   )
   public static int field11213;
   @OriginalMember(
      owner = "client!pg",
      name = "n",
      descriptor = "I"
   )
   public static int field11214;
   @OriginalMember(
      owner = "client!pg",
      name = "h",
      descriptor = "I"
   )
   public static int field11215;
   @OriginalMember(
      owner = "client!pg",
      name = "p",
      descriptor = "I"
   )
   public static int field11218;
   @OriginalMember(
      owner = "client!pg",
      name = "i",
      descriptor = "I"
   )
   public static int field11219;
   @OriginalMember(
      owner = "client!pg",
      name = "q",
      descriptor = "Leaa;"
   )
   public static class526 field11220;

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(ZI)I"
   )
   public final int method5522(boolean arg0, int arg1) {
      try {
         if (arg0) {
            return -73;
         } else {
            ++field11201;
            return this.field11210[arg1] & 255;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11221[25] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(Ljava/lang/String;I[Lat;I)Ljava/lang/String;"
   )
   public final String method5523(String param1, int param2, class396[] param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "([Lat;Ljava/lang/String;BI)I"
   )
   public final int method5524(class396[] arg0, String arg1, byte arg2, int arg3) {
      int var5 = client.field4530;

      try {
         if (arg2 != -71) {
            this.field11216 = null;
         }

         ++field11205;
         int var6 = this.method5525(false, arg1, new int[]{arg3}, class364.field5465, arg0);
         int var7 = 0;
         int var8 = 0;
         int var9;
         if (var5 != 0) {
            var9 = this.method5526(class364.field5465[var8], arg0, arg2 ^ -59);
            if (~var7 > ~var9) {
               var7 = var9;
            }

            ++var8;
         }

         while(true) {
            int var10000;
            if (var8 >= var6) {
               var10000 = var7;
               if (var5 == 0) {
                  return var7;
               }
            } else {
               var10000 = this.method5526(class364.field5465[var8], arg0, arg2 ^ -59);
            }

            var9 = var10000;
            if (~var7 > ~var9) {
               var7 = var9;
            }

            ++var8;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field11221[14] + (arg0 != null ? field11221[8] : field11221[5]) + ',' + (arg1 != null ? field11221[8] : field11221[5]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(ZLjava/lang/String;[I[Ljava/lang/String;[Lat;)I"
   )
   public final int method5525(boolean param1, String param2, int[] param3, String[] param4, class396[] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(Ljava/lang/String;[Lat;I)I"
   )
   public final int method5526(String param1, class396[] param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(ZLld;)V"
   )
   public static final void method5527(boolean arg0, class180 arg1) {
      try {
         ++field11214;
         class290.field4059.method4060(23, arg1);
         arg1.field2217 = arg1.field2211.field1590;
         class506.field7477 += arg1.field2217;
         arg1.field2211.field1590 = 0;
         if (arg0) {
            field11211 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11221[13] + arg0 + ',' + (arg1 != null ? field11221[8] : field11221[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method5528(int arg0) {
      int var1 = client.field4530;

      try {
         ++field11203;
         if (arg0 != -63) {
            field11217 = null;
         }

         int var2 = 0;
         int var3 = 0;
         if (var1 != 0 || ~var3 > ~class323.field4603) {
            do {
               int var4 = 0;
               if (var1 != 0) {
                  if (class704.method5120(class353.field5360, true, true, var4, var2, var3)) {
                     ++var2;
                  }

                  if (var2 >= 512) {
                     return;
                  }

                  ++var4;
               }

               while(true) {
                  while(~var4 > ~class178.field2197) {
                     if (class704.method5120(class353.field5360, true, true, var4, var2, var3)) {
                        ++var2;
                     }

                     if (var2 >= 512) {
                        return;
                     }

                     ++var4;
                  }

                  if (var1 == 0) {
                     ++var3;
                     break;
                  }

                  if (var2 >= 512) {
                     return;
                  }

                  ++var4;
               }
            } while(~var3 > ~class323.field4603);

         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11221[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(Ljava/lang/String;[Lat;BII)I"
   )
   public final int method5529(String arg0, class396[] arg1, byte arg2, int arg3, int arg4) {
      try {
         if (arg2 != 76) {
            field11218 = 78;
         }

         ++field11208;
         if (arg4 == 0) {
            arg4 = this.field11209;
         }

         int var6 = this.method5525(false, arg0, new int[]{arg3}, class364.field5465, arg1);
         int var7 = (var6 + -1) * arg4;
         return this.field11204 + var7 + this.field11206;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field11221[22] + (arg0 != null ? field11221[8] : field11221[5]) + ',' + (arg1 != null ? field11221[8] : field11221[5]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(CBI)I"
   )
   public final int method5530(char arg0, byte arg1, int arg2) {
      try {
         ++field11207;
         if (arg1 > -91) {
            return -48;
         } else {
            return this.field11216 != null ? this.field11216[arg2][arg0] : 0;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11221[23] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(II[Lat;Ljava/lang/String;)I"
   )
   public final int method5531(int arg0, int arg1, class396[] arg2, String arg3) {
      try {
         ++field11212;
         return arg1 < 17 ? 26 : this.method5525(false, arg3, new int[]{arg0}, class364.field5465, arg2);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field11221[21] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11221[8] : field11221[5]) + ',' + (arg3 != null ? field11221[8] : field11221[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(Ljava/lang/String;I)I"
   )
   public final int method5532(String arg0, int arg1) {
      try {
         int var3 = -80 % ((31 - arg1) / 44);
         ++field11219;
         return this.method5526(arg0, (class396[])null, 122);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11221[17] + (arg0 != null ? field11221[8] : field11221[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5533(int arg0) {
      try {
         if (arg0 == 0) {
            field11217 = null;
            field11220 = null;
            field11211 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11221[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class763(byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5534(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5535(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
