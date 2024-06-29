import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class436 extends class8 {
   @OriginalMember(
      owner = "client!efa",
      name = "I",
      descriptor = "Z"
   )
   public boolean field6388;
   @OriginalMember(
      owner = "client!efa",
      name = "J",
      descriptor = "F"
   )
   public float field6385;
   @OriginalMember(
      owner = "client!efa",
      name = "O",
      descriptor = "F"
   )
   public float field6386;
   @OriginalMember(
      owner = "client!efa",
      name = "N",
      descriptor = "I"
   )
   public int field6378;
   @OriginalMember(
      owner = "client!efa",
      name = "K",
      descriptor = "I"
   )
   public int field6383;
   @OriginalMember(
      owner = "client!efa",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6389 = new String[]{method3396(method3395("\u0005H(X")), method3396(method3395("\u0010\u0013j\u001a\u0011")), method3396(method3395("\u000e[%\u001aP\u0002S-@RC")), method3396(method3395("WZ0\n")), method3396(method3395("\u000e[%\u001a.C")), method3396(method3395("WQ0\n")), method3396(method3395("\u000e[%\u001a/C"))};
   @OriginalMember(
      owner = "client!efa",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field6381 = new int[4];
   @OriginalMember(
      owner = "client!efa",
      name = "L",
      descriptor = "I"
   )
   public static int field6387 = 0;
   @OriginalMember(
      owner = "client!efa",
      name = "P",
      descriptor = "[B"
   )
   public static byte[] field6382 = null;
   @OriginalMember(
      owner = "client!efa",
      name = "S",
      descriptor = "I"
   )
   public static int field6384;
   @OriginalMember(
      owner = "client!efa",
      name = "Q",
      descriptor = "[I"
   )
   public static int[] field6379;
   @OriginalMember(
      owner = "client!efa",
      name = "R",
      descriptor = "[Ljava/lang/Object;"
   )
   public static Object[] field6380;

   @OriginalMember(
      owner = "client!efa",
      name = "<init>",
      descriptor = "(Laea;IIIIIIZ)V"
   )
   public class436(class678 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      super(arg0, 3553, arg1, arg2, arg5, arg6);

      try {
         this.field6388 = false;
         this.field6385 = (float)arg3 / (float)arg5;
         this.field6386 = (float)arg4 / (float)arg6;
         this.field6378 = arg4;
         this.field6383 = arg3;
         this.method67(false, -86, false);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field6389[2] + (arg0 != null ? field6389[1] : field6389[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "<init>",
      descriptor = "(Laea;IIIII)V"
   )
   public class436(class678 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field6385 = (float)arg2 / (float)arg4;
         this.field6386 = (float)arg3 / (float)arg5;
         this.field6378 = arg3;
         this.field6383 = arg2;
         this.field6388 = false;
         this.method67(false, 65, false);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6389[2] + (arg0 != null ? field6389[1] : field6389[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "<init>",
      descriptor = "(Laea;IIII[I)V"
   )
   public class436(class678 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
      super(arg0, 3553, 6408, arg3, arg4);

      try {
         this.field6383 = arg1;
         this.field6378 = arg2;
         this.method64(0, 0, arg5, 0, arg2, 117, 0, true, arg1);
         this.field6386 = (float)arg2 / (float)arg4;
         this.field6388 = false;
         this.field6385 = (float)arg1 / (float)arg3;
         this.method67(false, 74, false);
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6389[2] + (arg0 != null ? field6389[1] : field6389[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6389[1] : field6389[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "<init>",
      descriptor = "(Laea;IIIIIZ)V"
   )
   public class436(class678 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);

      try {
         this.field6383 = arg4;
         this.field6378 = arg5;
         if (~super.field10295 == -34038) {
            this.field6385 = (float)arg4;
            this.field6388 = false;
            this.field6386 = (float)arg5;
         } else {
            this.field6388 = true;
            this.field6385 = this.field6386 = 1.0F;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field6389[2] + (arg0 != null ? field6389[1] : field6389[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "d",
      descriptor = "(B)V"
   )
   public static void method3393(byte arg0) {
      try {
         field6382 = null;
         if (arg0 < 90) {
            method3393((byte)88);
         }

         field6380 = null;
         field6379 = null;
         field6381 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6389[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "<init>",
      descriptor = "(Laea;IIIII[BI)V"
   )
   public class436(class678 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field6378 = arg3;
         this.field6383 = arg2;
         this.method68(arg6, true, arg3, arg2, 0, 0, arg7, 0, 0, (byte)4);
         this.field6385 = (float)arg2 / (float)arg4;
         this.field6386 = (float)arg3 / (float)arg5;
         this.field6388 = false;
         this.method67(false, -114, false);
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field6389[2] + (arg0 != null ? field6389[1] : field6389[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6389[1] : field6389[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "<init>",
      descriptor = "(Laea;IIII)V"
   )
   public class436(class678 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         label23: {
            if (super.field10295 != 34037) {
               this.field6388 = true;
               this.field6385 = this.field6386 = 1.0F;
               if (!client.field10022) {
                  break label23;
               }
            }

            this.field6385 = (float)arg3;
            this.field6386 = (float)arg4;
            this.field6388 = false;
         }

         this.field6378 = arg4;
         this.field6383 = arg3;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6389[2] + (arg0 != null ? field6389[1] : field6389[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "<init>",
      descriptor = "(Laea;IIIZ[III)V"
   )
   public class436(class678 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
      super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         label28: {
            this.field6378 = arg3;
            if (~super.field10295 != -34038) {
               this.field6385 = this.field6386 = 1.0F;
               this.field6388 = true;
               if (!client.field10022) {
                  break label28;
               }
            }

            this.field6388 = false;
            this.field6386 = (float)arg3;
            this.field6385 = (float)arg2;
         }

         this.field6383 = arg2;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field6389[2] + (arg0 != null ? field6389[1] : field6389[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6389[1] : field6389[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;"
   )
   public static final String method3394(String arg0, byte arg1) {
      boolean var2 = client.field10022;

      try {
         ++field6384;
         int var3 = arg0.length();
         int var4 = 0;
         if (arg1 != -78) {
            method3394((String)null, (byte)79);
         }

         int var5 = 0;
         char var6;
         if (var2) {
            var6 = arg0.charAt(var5);
            if (var6 != '<') {
               if (~var6 == -63) {
                  var4 += 3;
               }
            } else {
               var4 += 3;
            }

            ++var5;
         }

         while(true) {
            char var10000;
            if (~var5 <= ~var3) {
               StringBuffer var7 = new StringBuffer(var3 + var4);
               var10000 = 0;
               if (!var2) {
                  int var8 = 0;
                  String var12;
                  if (var2) {
                     var12 = arg0;
                  } else if (var3 <= var8) {
                     var12 = var7.toString();
                     if (!var2) {
                        return var12;
                     }
                  } else {
                     var12 = arg0;
                  }

                  while(true) {
                     label103: {
                        char var9 = var12.charAt(var8);
                        if (var9 == '<') {
                           var7.append(field6389[5]);
                           if (!var2) {
                              ++var8;
                              break label103;
                           }
                        }

                        if (var9 != '>') {
                           var7.append(var9);
                           if (var2) {
                              var7.append(field6389[3]);
                              ++var8;
                           } else {
                              ++var8;
                           }
                        } else {
                           var7.append(field6389[3]);
                           ++var8;
                        }
                     }

                     if (var3 <= var8) {
                        var12 = var7.toString();
                        if (!var2) {
                           return var12;
                        }
                     } else {
                        var12 = arg0;
                     }
                  }
               }
            } else {
               var10000 = arg0.charAt(var5);
            }

            var6 = var10000;
            if (var6 != '<') {
               if (~var6 == -63) {
                  var4 += 3;
               }
            } else {
               var4 += 3;
            }

            ++var5;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field6389[4] + (arg0 != null ? field6389[1] : field6389[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "<init>",
      descriptor = "(Laea;IIIIZ[BI)V"
   )
   public class436(class678 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         label28: {
            this.field6383 = arg3;
            if (~super.field10295 == -34038) {
               this.field6385 = (float)arg3;
               this.field6388 = false;
               this.field6386 = (float)arg4;
               if (!client.field10022) {
                  break label28;
               }
            }

            this.field6385 = this.field6386 = 1.0F;
            this.field6388 = true;
         }

         this.field6378 = arg4;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field6389[2] + (arg0 != null ? field6389[1] : field6389[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6389[1] : field6389[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3395(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!efa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3396(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
