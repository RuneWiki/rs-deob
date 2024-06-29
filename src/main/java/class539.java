import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class539 implements Runnable {
   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7897 = new String[]{method4091(method4090("\b\u001b\u000e\\\u0019I")), method4091(method4090("\u000f\u0007\u0003\u001e")), method4091(method4090("\u001a\\A\\!")), method4091(method4090("\b\u001b\u000e\\\u001fI")), method4091(method4090("\b\u001b\u000e\\\u001bI")), method4091(method4090("\b\u001b\u000e\\\u001dI")), method4091(method4090("\b\u001b\u000e\\\u0018I")), method4091(method4090("N\u001c\n\u0005/O\u0005\u001cM;\u0000\u001f\nO")), method4091(method4090("\b\u001b\u000e\\\u001eI")), method4091(method4090("\t\u0006\u001b\u0002fN]")), method4091(method4090("\b\u001b\u000e\\.\u0014\u001cG"))};
   @OriginalMember(
      owner = "client!iia",
      name = "i",
      descriptor = "I"
   )
   public static int field7884 = 0;
   @OriginalMember(
      owner = "client!iia",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field7894 = null;
   @OriginalMember(
      owner = "client!iia",
      name = "m",
      descriptor = "I"
   )
   public static int field7885;
   @OriginalMember(
      owner = "client!iia",
      name = "k",
      descriptor = "I"
   )
   public static int field7888;
   @OriginalMember(
      owner = "client!iia",
      name = "l",
      descriptor = "I"
   )
   public static int field7889;
   @OriginalMember(
      owner = "client!iia",
      name = "e",
      descriptor = "I"
   )
   public static int field7890;
   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "I"
   )
   public static int field7892;
   @OriginalMember(
      owner = "client!iia",
      name = "b",
      descriptor = "I"
   )
   public static int field7893;
   @OriginalMember(
      owner = "client!iia",
      name = "j",
      descriptor = "I"
   )
   public static int field7895;
   @OriginalMember(
      owner = "client!iia",
      name = "d",
      descriptor = "Lit;"
   )
   private class769 field7886;
   @OriginalMember(
      owner = "client!iia",
      name = "h",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field7887;
   @OriginalMember(
      owner = "client!iia",
      name = "f",
      descriptor = "Z"
   )
   private volatile boolean field7891;
   @OriginalMember(
      owner = "client!iia",
      name = "g",
      descriptor = "[Ljda;"
   )
   private class90[] field7896;

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(IIIII[B)V"
   )
   public static final void method4083(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      boolean var6 = client.field1481;

      try {
         ++field7888;
         if (arg0 > arg4) {
            arg2 += arg4;
            arg3 = -arg4 + arg0 >> 2;
            int var9;
            if (var6) {
               var9 = arg2 + 1;
               arg5[arg2] = 1;
               int var10 = var9 + 1;
               arg5[var9] = 1;
               int var11 = var10 + 1;
               arg5[var10] = 1;
               arg2 = var11 + 1;
               arg5[var11] = 1;
            }

            while(true) {
               while(true) {
                  --arg3;
                  if (~arg3 > -1) {
                     arg3 = -arg4 + arg0 & arg1;
                     if (!var6) {
                        if (!var6) {
                           --arg3;
                           if (arg3 < 0) {
                              return;
                           }
                        }

                        do {
                           arg5[arg2++] = 1;
                           --arg3;
                        } while(arg3 >= 0);

                        return;
                     }

                     arg5[arg2++] = 1;
                  } else {
                     var9 = arg2 + 1;
                     arg5[arg2] = 1;
                     arg5[var9++] = 1;
                     arg5[var9++] = 1;
                     arg2 = var9 + 1;
                     arg5[var9] = 1;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7897[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7897[2] : field7897[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4084(int arg0) {
      try {
         field7894 = null;
         int var1 = -84 / ((arg0 - -41) / 38);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7897[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method4085(int arg0) {
      try {
         if (arg0 != 3) {
            field7884 = -59;
         }

         ++field7885;
         if (this.field7891) {
            return true;
         } else {
            if (this.field7886 == null) {
               try {
                  int var2 = class781.field11380 == class583.field8611 ? 80 : class489.field6822.field11035 + 7000;
                  this.field7886 = class366.field5092.method5335(arg0 ^ 3, new URL(field7897[9] + class489.field6822.field11029 + ":" + var2 + field7897[7] + class688.field10127.field6966));
               } catch (MalformedURLException var4) {
                  return true;
               }
            }

            if (this.field7886 != null && this.field7886.field11210 != 2) {
               if (~this.field7886.field11210 != -2) {
                  return false;
               } else {
                  if (this.field7887 == null) {
                     this.field7887 = new Thread(this);
                     this.field7887.start();
                  }

                  return this.field7891;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7897[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(III)Ldv;"
   )
   public static final class131 method4086(int arg0, int arg1, int arg2) {
      class731 var3 = class548.field8080[arg0][arg1][arg2];
      return var3 == null ? null : var3.field10654;
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(BI)Ljda;"
   )
   public final class90 method4087(byte arg0, int arg1) {
      try {
         ++field7893;
         if (this.field7896 != null && arg1 >= 0 && this.field7896.length > arg1) {
            if (arg0 >= -119) {
               this.field7896 = null;
            }

            return this.field7896[arg1];
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7897[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method4088(int arg0) {
      try {
         if (arg0 != 3) {
            return 41;
         } else {
            ++field7892;
            return class532.field7800.method733((byte)82);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7897[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "a",
      descriptor = "(ILiu;IIIB)Lik;"
   )
   public static final class124 method4089(int arg0, class530 arg1, int arg2, int arg3, int arg4, byte arg5) {
      try {
         ++field7895;
         if (arg5 != 78) {
            return null;
         } else if (arg1.field7760 || class181.method1525((byte)-57, arg0) && class181.method1525((byte)-107, arg3)) {
            return new class124(arg1, 3553, arg2, arg4, arg0, arg3, true);
         } else {
            return !arg1.field7695 ? new class124(arg1, arg2, arg4, arg0, arg3, class109.method978(-1, arg0), class109.method978(arg5 + -79, arg3), true) : new class124(arg1, 34037, arg2, arg4, arg0, arg3, true);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field7897[5] + arg0 + ',' + (arg1 != null ? field7897[2] : field7897[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iia",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4090(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4091(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
