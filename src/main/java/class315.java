import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class315 {
   @OriginalMember(
      owner = "client!gaa",
      name = "d",
      descriptor = "I"
   )
   public int field4205;
   @OriginalMember(
      owner = "client!gaa",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public String field4208;
   @OriginalMember(
      owner = "client!gaa",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public String field4211;
   @OriginalMember(
      owner = "client!gaa",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   public String field4212;
   @OriginalMember(
      owner = "client!gaa",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public String field4201;
   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "I"
   )
   public int field4207;
   @OriginalMember(
      owner = "client!gaa",
      name = "n",
      descriptor = "I"
   )
   public int field4210;
   @OriginalMember(
      owner = "client!gaa",
      name = "h",
      descriptor = "I"
   )
   public int field4203;
   @OriginalMember(
      owner = "client!gaa",
      name = "f",
      descriptor = "I"
   )
   public int field4213;
   @OriginalMember(
      owner = "client!gaa",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field4206;
   @OriginalMember(
      owner = "client!gaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4217 = new String[]{method2370(method2369("\\>r\u000bz\u0013")), method2370(method2369("U*\u007fI")), method2370(method2369("\\>r\u000b\u007f\u0013")), method2370(method2369("@q=\u000bC")), method2370(method2369("\\>r\u000b{\u0013")), method2370(method2369("\\>r\u000b}\u0013")), method2370(method2369("\\>r\u000b\u0002R1zQ\u0000\u0013")), method2370(method2369("\\>r\u000b|\u0013"))};
   @OriginalMember(
      owner = "client!gaa",
      name = "b",
      descriptor = "[S"
   )
   public static short[] field4209 = new short[256];
   @OriginalMember(
      owner = "client!gaa",
      name = "c",
      descriptor = "I"
   )
   public static int field4200;
   @OriginalMember(
      owner = "client!gaa",
      name = "g",
      descriptor = "I"
   )
   public static int field4202;
   @OriginalMember(
      owner = "client!gaa",
      name = "o",
      descriptor = "I"
   )
   public static int field4204;
   @OriginalMember(
      owner = "client!gaa",
      name = "m",
      descriptor = "I"
   )
   public static int field4214;
   @OriginalMember(
      owner = "client!gaa",
      name = "q",
      descriptor = "I"
   )
   public static int field4215;
   @OriginalMember(
      owner = "client!gaa",
      name = "k",
      descriptor = "I"
   )
   public static int field4216;

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;BILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V"
   )
   public final void method2364(String arg0, int arg1, String arg2, byte arg3, int arg4, String arg5, int arg6, String arg7, String arg8) {
      try {
         ++field4202;
         this.field4205 = class785.method5656(16);
         this.field4208 = arg0;
         this.field4213 = arg4;
         this.field4212 = arg7;
         this.field4207 = arg6;
         this.field4203 = class369.field5205;
         this.field4201 = arg5;
         this.field4211 = arg2;
         this.field4206 = arg8;
         if (arg3 != 45) {
            this.field4212 = null;
         }

         this.field4210 = arg1;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field4217[4] + (arg0 != null ? field4217[3] : field4217[1]) + ',' + arg1 + ',' + (arg2 != null ? field4217[3] : field4217[1]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field4217[3] : field4217[1]) + ',' + arg6 + ',' + (arg7 != null ? field4217[3] : field4217[1]) + ',' + (arg8 != null ? field4217[3] : field4217[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "(I[IZI[Ljava/lang/Object;)V"
   )
   public static final void method2365(int param0, int[] param1, boolean param2, int param3, Object[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "([BIIIBI)V"
   )
   public static final void method2366(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
      boolean var6 = client.field4273;

      try {
         ++field4214;
         if (~arg2 < ~arg3) {
            if (arg4 < -83) {
               arg1 = arg2 - arg3 >> 2;
               arg5 += arg3;
               int var9;
               if (var6) {
                  var9 = arg5 + 1;
                  arg0[arg5] = 1;
                  int var10 = var9 + 1;
                  arg0[var9] = 1;
                  int var11 = var10 + 1;
                  arg0[var10] = 1;
                  arg5 = var11 + 1;
                  arg0[var11] = 1;
               }

               while(true) {
                  while(true) {
                     --arg1;
                     if (~arg1 > -1) {
                        arg1 = -arg3 + arg2 & 3;
                        if (!var6) {
                           if (var6) {
                              arg0[arg5++] = 1;
                           }

                           while(true) {
                              --arg1;
                              if (~arg1 > -1) {
                                 return;
                              }

                              arg0[arg5++] = 1;
                           }
                        }

                        arg0[arg5++] = 1;
                     } else {
                        var9 = arg5 + 1;
                        arg0[arg5] = 1;
                        arg0[var9++] = 1;
                        arg0[var9++] = 1;
                        arg5 = var9 + 1;
                        arg0[var9] = 1;
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4217[2] + (arg0 != null ? field4217[3] : field4217[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2367(byte arg0) {
      try {
         if (arg0 != 1) {
            field4209 = null;
         }

         field4209 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4217[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2368(int arg0) {
      try {
         ++field4216;
         class193.field2357 = true;
         if (arg0 != -16259) {
            field4209 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4217[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "<init>",
      descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V"
   )
   public class315(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
      try {
         this.field4205 = class785.method5656(16);
         this.field4208 = arg2;
         this.field4211 = arg4;
         this.field4212 = arg5;
         this.field4201 = arg3;
         this.field4207 = arg0;
         this.field4210 = arg6;
         this.field4203 = class369.field5205;
         this.field4213 = arg1;
         this.field4206 = arg7;
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field4217[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4217[3] : field4217[1]) + ',' + (arg3 != null ? field4217[3] : field4217[1]) + ',' + (arg4 != null ? field4217[3] : field4217[1]) + ',' + (arg5 != null ? field4217[3] : field4217[1]) + ',' + arg6 + ',' + (arg7 != null ? field4217[3] : field4217[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2369(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2370(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
