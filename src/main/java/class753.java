import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class753 {
   @OriginalMember(
      owner = "client!et",
      name = "d",
      descriptor = "Z"
   )
   private boolean field11024 = true;
   @OriginalMember(
      owner = "client!et",
      name = "j",
      descriptor = "I"
   )
   public int field11028 = 443;
   @OriginalMember(
      owner = "client!et",
      name = "f",
      descriptor = "Z"
   )
   private boolean field11034 = false;
   @OriginalMember(
      owner = "client!et",
      name = "l",
      descriptor = "I"
   )
   public int field11031 = 43594;
   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11037 = new String[]{method5460(method5459("\rT\bse")), method5460(method5459("\u0013\u000e\b\u001c0")), method5460(method5459("\u0006UJ^")), method5460(method5459("\rT\bue")), method5460(method5459("\rT\bwe")), method5460(method5459("\rT\bqe")), method5460(method5459("\rT\bte")), method5460(method5459("Hs\u001c\u0012")), method5460(method5459("\rT\bve")), method5460(method5459("\rT\bpe"))};
   @OriginalMember(
      owner = "client!et",
      name = "e",
      descriptor = "Lfea;"
   )
   public static class681 field11027 = new class681(15, 0, 1, 0);
   @OriginalMember(
      owner = "client!et",
      name = "i",
      descriptor = "I"
   )
   public static int field11022;
   @OriginalMember(
      owner = "client!et",
      name = "n",
      descriptor = "I"
   )
   public static int field11023;
   @OriginalMember(
      owner = "client!et",
      name = "b",
      descriptor = "I"
   )
   public static int field11025;
   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "I"
   )
   public static int field11026;
   @OriginalMember(
      owner = "client!et",
      name = "m",
      descriptor = "I"
   )
   public static int field11032;
   @OriginalMember(
      owner = "client!et",
      name = "g",
      descriptor = "I"
   )
   public static int field11033;
   @OriginalMember(
      owner = "client!et",
      name = "c",
      descriptor = "I"
   )
   public int field11035;
   @OriginalMember(
      owner = "client!et",
      name = "k",
      descriptor = "I"
   )
   public static int field11036;
   @OriginalMember(
      owner = "client!et",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field11029;
   @OriginalMember(
      owner = "client!et",
      name = "o",
      descriptor = "[Lmn;"
   )
   public static class238[] field11030;

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(ZLet;)Z"
   )
   public final boolean method5452(boolean arg0, class753 arg1) {
      try {
         if (arg0) {
            field11027 = null;
         }

         ++field11026;
         if (arg1 == null) {
            return false;
         } else {
            return ~this.field11035 == ~arg1.field11035 && this.field11029.equals(arg1.field11029);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11037[9] + arg0 + ',' + (arg1 != null ? field11037[1] : field11037[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5453(int arg0) {
      try {
         if (arg0 >= -106) {
            field11030 = null;
         }

         field11027 = null;
         field11030 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11037[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method5454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         int var7 = arg2;
         if (var6) {
            class385.method3045(arg0, arg4, class237.field3001[arg2], arg5, (byte)-98);
            var7 = arg2 + 1;
         }

         while(true) {
            int var10000;
            int var10001;
            if (arg1 < var7) {
               ++field11025;
               var10000 = arg3;
               var10001 = 15513;
               if (!var6) {
                  if (arg3 != 15513) {
                     method5455(48, 97, 86, (class292)null);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = arg0;
               var10001 = arg4;
            }

            class385.method3045(var10000, var10001, class237.field3001[var7], arg5, (byte)-98);
            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field11037[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(IIILl;)Llha;"
   )
   public static final class36 method5455(int arg0, int arg1, int arg2, class292 arg3) {
      try {
         ++field11036;
         int var4 = arg3.field4021 | arg1 << 10;
         class36 var5 = (class36)class791.field11561.method2947((long)var4 << 16, 28581);
         if (var5 != null) {
            return var5;
         } else {
            byte[] var6 = class160.field2044.method2700(class160.field2044.method2708(0, var4), -2);
            if (var6 != null) {
               if (~var6.length >= -2) {
                  return null;
               } else {
                  class36 var7;
                  try {
                     var7 = class739.method5367(var6, (byte)-108);
                  } catch (Exception var20) {
                     throw new RuntimeException(var20.getMessage() + field11037[7] + var4);
                  }

                  var7.field503 = arg3;
                  class791.field11561.method2946(var7, true, (long)var4 << 16);
                  return var7;
               }
            } else {
               int var9 = arg0 + 65536 << 10 | arg3.field4021;
               class36 var10 = (class36)class791.field11561.method2947((long)var9 << 16, 28581);
               if (var10 != null) {
                  return var10;
               } else {
                  byte[] var11 = class160.field2044.method2700(class160.field2044.method2708(0, var9), -2);
                  if (var11 != null) {
                     if (~var11.length >= -2) {
                        return null;
                     } else {
                        class36 var12;
                        try {
                           var12 = class739.method5367(var11, (byte)-101);
                        } catch (Exception var21) {
                           throw new RuntimeException(var21.getMessage() + field11037[7] + var9);
                        }

                        var12.field503 = arg3;
                        class791.field11561.method2946(var12, true, (long)var9 << 16);
                        return var12;
                     }
                  } else {
                     if (arg2 > -19) {
                        field11027 = null;
                     }

                     int var14 = arg3.field4021 | 67107840;
                     class36 var15 = (class36)class791.field11561.method2947((long)var14 << 16, 28581);
                     if (var15 != null) {
                        return var15;
                     } else {
                        byte[] var16 = class160.field2044.method2700(class160.field2044.method2708(0, var14), -2);
                        if (var16 != null) {
                           if (var16.length <= 1) {
                              return null;
                           } else {
                              class36 var17;
                              try {
                                 var17 = class739.method5367(var16, (byte)-124);
                              } catch (Exception var22) {
                                 throw new RuntimeException(var22.getMessage() + field11037[7] + var14);
                              }

                              var17.field503 = arg3;
                              class791.field11561.method2946(var17, true, (long)var14 << 16);
                              return var17;
                           }
                        } else {
                           return null;
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class93.method866(var23, field11037[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11037[1] : field11037[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5456(int arg0) {
      boolean var2 = client.field1481;

      try {
         label29: {
            ++field11023;
            if (!this.field11024) {
               this.field11034 = true;
               this.field11024 = true;
               if (!var2) {
                  break label29;
               }
            }

            if (this.field11034) {
               this.field11034 = false;
               if (!var2) {
                  break label29;
               }
            }

            this.field11024 = false;
         }

         int var3 = -96 / ((arg0 - -54) / 50);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11037[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(Lgj;I)Lit;"
   )
   public final class769 method5457(class736 arg0, int arg1) {
      try {
         if (arg1 != 18746) {
            method5453(-37);
         }

         ++field11032;
         return arg0.method5334(this.field11024 ? this.field11028 : this.field11031, this.field11029, (byte)-73, this.field11034);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11037[0] + (arg0 != null ? field11037[1] : field11037[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "a",
      descriptor = "(CII)I"
   )
   public static final int method5458(char arg0, int arg1, int arg2) {
      try {
         ++field11033;
         int var3 = 92 / ((arg2 - -37) / 59);
         int var4 = arg0 << 4;
         if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var7 = Character.toLowerCase(arg0);
            var4 = (var7 << 4) + 1;
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field11037[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5459(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!et",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5460(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
