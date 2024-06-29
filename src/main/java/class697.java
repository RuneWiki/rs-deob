import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class697 {
   @OriginalMember(
      owner = "client!qda",
      name = "f",
      descriptor = "[B"
   )
   private byte[] field10361;
   @OriginalMember(
      owner = "client!qda",
      name = "g",
      descriptor = "I"
   )
   public int field10349;
   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "[[B"
   )
   private byte[][] field10352;
   @OriginalMember(
      owner = "client!qda",
      name = "m",
      descriptor = "I"
   )
   public int field10350;
   @OriginalMember(
      owner = "client!qda",
      name = "d",
      descriptor = "I"
   )
   public int field10358;
   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10368 = new String[]{method5132(method5131("\\\u001c\u0014L\u0014\u0005")), method5132(method5131("\\\u001c\u0014L\u0015\u0005")), method5132(method5131("C\r\u0019\u000e")), method5132(method5131("VV[L*")), method5132(method5131("\\\u001c\u0014L\u001e\u0005")), method5132(method5131("\\\u001c\u0014L\u001d\u0005")), method5132(method5131("C\u001a\u0006\u0012")), method5132(method5131("Y\u0011\u0018\u0007$")), method5132(method5131("_\u001d\u0012")), method5132(method5131("\\\u001c\u0014L\u001f\u0005")), method5132(method5131("D\u0015\u0012_")), method5132(method5131("^\u0010\f")), method5132(method5131("J\f")), method5132(method5131("O\n")), method5132(method5131("A\f")), method5132(method5131("H\r\u0007\r")), method5132(method5131("N\u0017\u0005\u001b")), method5132(method5131("\\\u001c\u0014L\u0012\u0005")), method5132(method5131("\\\u001c\u0014L\u0013\u0005")), method5132(method5131("\\\u001c\u0014L\u0019\u0005")), method5132(method5131("\\\u001c\u0014LkD\u0016\u001c\u0016i\u0005")), method5132(method5131("\\\u001c\u0014L\u0010\u0005")), method5132(method5131("\\\u001c\u0014L\u001a\u0005")), method5132(method5131("\\\u001c\u0014L\u001c\u0005")), method5132(method5131("\\\u001c\u0014L\u0011\u0005")), method5132(method5131("\u0003V[")), method5132(method5131("\\\u001c\u0014L\u0016\u0005")), method5132(method5131("\\\u001c\u0014L\u001b\u0005"))};
   @OriginalMember(
      owner = "client!qda",
      name = "t",
      descriptor = "I"
   )
   public static int field10347 = 0;
   @OriginalMember(
      owner = "client!qda",
      name = "b",
      descriptor = "I"
   )
   public static int field10346;
   @OriginalMember(
      owner = "client!qda",
      name = "i",
      descriptor = "I"
   )
   public static int field10348;
   @OriginalMember(
      owner = "client!qda",
      name = "c",
      descriptor = "I"
   )
   public static int field10351;
   @OriginalMember(
      owner = "client!qda",
      name = "s",
      descriptor = "I"
   )
   public static int field10353;
   @OriginalMember(
      owner = "client!qda",
      name = "u",
      descriptor = "I"
   )
   public static int field10354;
   @OriginalMember(
      owner = "client!qda",
      name = "p",
      descriptor = "I"
   )
   public static int field10355;
   @OriginalMember(
      owner = "client!qda",
      name = "h",
      descriptor = "I"
   )
   public static int field10356;
   @OriginalMember(
      owner = "client!qda",
      name = "j",
      descriptor = "I"
   )
   public static int field10357;
   @OriginalMember(
      owner = "client!qda",
      name = "o",
      descriptor = "I"
   )
   public static int field10359;
   @OriginalMember(
      owner = "client!qda",
      name = "q",
      descriptor = "I"
   )
   public static int field10360;
   @OriginalMember(
      owner = "client!qda",
      name = "r",
      descriptor = "I"
   )
   public static int field10362;
   @OriginalMember(
      owner = "client!qda",
      name = "v",
      descriptor = "I"
   )
   public static int field10363;
   @OriginalMember(
      owner = "client!qda",
      name = "l",
      descriptor = "I"
   )
   public static int field10364;
   @OriginalMember(
      owner = "client!qda",
      name = "e",
      descriptor = "I"
   )
   public static int field10365;
   @OriginalMember(
      owner = "client!qda",
      name = "n",
      descriptor = "I"
   )
   public static int field10366;
   @OriginalMember(
      owner = "client!qda",
      name = "k",
      descriptor = "I"
   )
   public static int field10367;

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(ZI)I"
   )
   public final int method5117(boolean arg0, int arg1) {
      try {
         ++field10356;
         if (!arg0) {
            this.method5120(false, -118, (char)65494);
         }

         return 255 & this.field10361[arg1];
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10368[19] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public static final void method5118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field10363;
         class724.method5348(arg1, arg4, (byte)-120, arg8, arg2, arg6, arg0, arg5, arg7, arg3);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field10368[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(Ljava/lang/String;[Ljq;B)I"
   )
   public final int method5119(String param1, class672[] param2, byte param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(ZIC)I"
   )
   public final int method5120(boolean arg0, int arg1, char arg2) {
      try {
         ++field10365;
         if (!arg0) {
            return -34;
         } else {
            return this.field10352 != null ? this.field10352[arg1][arg2] : 0;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10368[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(II[Ljq;Ljava/lang/String;)Ljava/lang/String;"
   )
   public final String method5121(int param1, int param2, class672[] param3, String param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method5122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         if (arg2 <= -97) {
            ++field10351;
            if (~arg0 == ~arg5) {
               class690.method5085(arg0, arg3, arg4, false, arg7, arg6, arg1);
            } else if (~(-arg0 + arg3) <= ~class443.field6806 && class182.field2833 >= arg3 - -arg0 && class368.field5724 <= -arg5 + arg7 && arg7 - -arg5 <= class84.field1212) {
               class227.method1965(arg6, arg4, arg7, arg5, arg3, arg0, (byte)81, arg1);
            } else {
               class486.method3777(arg4, arg3, (byte)107, arg7, arg5, arg1, arg0, arg6);
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field10368[23] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(Z[Ljava/lang/String;[Ljq;Ljava/lang/String;[I)I"
   )
   public final int method5123(boolean param1, String[] param2, class672[] param3, String param4, int[] param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(Ljava/lang/String;II[Ljq;)I"
   )
   public final int method5124(String arg0, int arg1, int arg2, class672[] arg3) {
      boolean var5 = client.field1786;

      try {
         if (arg1 != 1) {
            return 109;
         } else {
            ++field10367;
            int var6 = this.method5123(false, class789.field11551, arg3, arg0, new int[]{arg2});
            int var7 = 0;
            int var8 = 0;
            int var9;
            if (var5) {
               var9 = this.method5119(class789.field11551[var8], arg3, (byte)127);
               if (~var7 > ~var9) {
                  var7 = var9;
               }

               ++var8;
            }

            while(true) {
               int var10000;
               if (~var8 <= ~var6) {
                  var10000 = var7;
                  if (!var5) {
                     return var7;
                  }
               } else {
                  var10000 = this.method5119(class789.field11551[var8], arg3, (byte)127);
               }

               var9 = var10000;
               if (~var7 > ~var9) {
                  var7 = var9;
               }

               ++var8;
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field10368[24] + (arg0 != null ? field10368[3] : field10368[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10368[3] : field10368[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5125(int arg0, int arg1, int arg2) {
      try {
         ++field10354;
         if (arg0 != -21955) {
            field10346 = -71;
         }

         return (arg1 & 2048) != 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10368[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(I[Ljq;ZLjava/lang/String;)I"
   )
   public final int method5126(int arg0, class672[] arg1, boolean arg2, String arg3) {
      try {
         ++field10366;
         if (arg2) {
            this.method5126(47, (class672[])null, false, (String)null);
         }

         return this.method5123(false, class789.field11551, arg1, arg3, new int[]{arg0});
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10368[18] + arg0 + ',' + (arg1 != null ? field10368[3] : field10368[2]) + ',' + arg2 + ',' + (arg3 != null ? field10368[3] : field10368[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(I[Ljq;ILjava/lang/String;I)I"
   )
   public final int method5127(int arg0, class672[] arg1, int arg2, String arg3, int arg4) {
      try {
         if (arg2 == 0) {
            arg2 = this.field10349;
         }

         ++field10360;
         int var6 = this.method5123(false, class789.field11551, arg1, arg3, new int[]{arg0});
         if (arg4 != 8364) {
            return -17;
         } else {
            int var7 = (var6 - 1) * arg2;
            return this.field10358 + this.field10350 - -var7;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field10368[27] + arg0 + ',' + (arg1 != null ? field10368[3] : field10368[2]) + ',' + arg2 + ',' + (arg3 != null ? field10368[3] : field10368[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method5128(long arg0, int arg1) {
      try {
         int var3 = -24 % ((-8 - arg1) / 57);
         ++field10357;
         if (~arg0 < -1L) {
            if (arg0 % 10L != 0L) {
               class525.method4053((byte)58, arg0);
            } else {
               class525.method4053((byte)58, arg0 + -1L);
               class525.method4053((byte)58, 1L);
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10368[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "a",
      descriptor = "(ZLjava/lang/String;)V"
   )
   public static final void method5129(boolean arg0, String arg1) {
      try {
         ++field10348;
         if (!arg1.equals("")) {
            ++class110.field1521;
            class29 var2 = class578.method4332((byte)-32);
            if (arg0) {
               field10347 = -75;
            }

            class577 var3 = class218.method1888(class775.field11388, 94, var2.field361);
            var3.field8531.method2864(-26110, class714.method5292((byte)-127, arg1));
            var3.field8531.method2862(arg1, true);
            var2.method211(var3, 124);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10368[5] + arg0 + ',' + (arg1 != null ? field10368[3] : field10368[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "b",
      descriptor = "(ZLjava/lang/String;)I"
   )
   public final int method5130(boolean arg0, String arg1) {
      try {
         ++field10364;
         return !arg0 ? 49 : this.method5119(arg1, (class672[])null, (byte)127);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10368[4] + arg0 + ',' + (arg1 != null ? field10368[3] : field10368[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qda",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class697(byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5131(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5132(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
