import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class603 {
   @OriginalMember(
      owner = "client!cr",
      name = "f",
      descriptor = "[I"
   )
   public int[] field8405;
   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8413 = new String[]{method4402(method4401("\n4vL/\u0007/,Nn")), method4402(method4401("\u0012hv^;")), method4402(method4401("\u000734\u001c")), method4402(method4401("\n4v4n")), method4402(method4401("\n4v1n")), method4402(method4401("\n4v2n")), method4402(method4401("\u0000 i")), method4402(method4401("\n4v3n"))};
   @OriginalMember(
      owner = "client!cr",
      name = "g",
      descriptor = "Ldg;"
   )
   public static class436 field8404 = new class436(method4402(method4401(">\u0012\u000f9\u0016")), method4402(method4401("\u0006 >\u0019%\f")), method4402(method4401("611\u0000")), 3);
   @OriginalMember(
      owner = "client!cr",
      name = "h",
      descriptor = "D"
   )
   public static double field8411;
   @OriginalMember(
      owner = "client!cr",
      name = "d",
      descriptor = "I"
   )
   public static int field8406;
   @OriginalMember(
      owner = "client!cr",
      name = "e",
      descriptor = "I"
   )
   public static int field8407;
   @OriginalMember(
      owner = "client!cr",
      name = "b",
      descriptor = "I"
   )
   public static int field8409;
   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "I"
   )
   public static int field8410;
   @OriginalMember(
      owner = "client!cr",
      name = "c",
      descriptor = "I"
   )
   public static int field8412;
   @OriginalMember(
      owner = "client!cr",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8408;

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(ILwm;)V"
   )
   private final void method4397(int arg0, class594 arg1) {
      boolean var3 = client.field4273;

      try {
         label61:
         while(true) {
            int var4 = arg1.method4288((byte)109);
            if (~var4 != -1) {
               if (~var4 != -2) {
                  continue;
               }

               int var5 = arg1.method4288((byte)81);
               this.field8405 = new int[var5];
               int var6 = 0;
               if (var3) {
                  break;
               }

               if (var3) {
                  this.field8405[var6] = arg1.method4288((byte)110);
                  ++var6;
               }

               while(true) {
                  while(var6 < this.field8405.length) {
                     this.field8405[var6] = arg1.method4288((byte)110);
                     ++var6;
                  }

                  if (!var3) {
                     if (!var3) {
                        continue label61;
                     }
                     break;
                  }

                  ++var6;
               }
            }

            ++field8406;
            break;
         }

         if (arg0 != 10264) {
            field8411 = -0.5378204058649978D;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field8413[3] + arg0 + ',' + (arg1 != null ? field8413[1] : field8413[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(BLha;)V"
   )
   public static final void method4398(byte param0, class65 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cr",
      name = "<init>",
      descriptor = "(Lqh;)V"
   )
   public class603(class74 arg0) {
      try {
         byte[] var2 = arg0.method733(6, (byte)-71);
         this.method4397(10264, new class594(var2));
         if (this.field8405 == null) {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8413[0] + (arg0 != null ? field8413[1] : field8413[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4399(int arg0) {
      try {
         field8404 = null;
         field8408 = null;
         if (arg0 != -12140) {
            method4399(-119);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8413[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method4400(int arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field8409;
         if (class388.field5433[arg1]) {
            return true;
         } else if (!class639.field9016.method728(true, arg1)) {
            return false;
         } else {
            int var3 = class639.field9016.method727(arg1, -32767);
            if (~var3 == -1) {
               class388.field5433[arg1] = true;
               return true;
            } else {
               if (class468.field6451[arg1] == null) {
                  class468.field6451[arg1] = new class657[var3];
               }

               if (arg0 != 2) {
                  field8411 = 0.1860531376528151D;
               }

               int var4 = 0;
               byte[] var5;
               class657 var6;
               if (var2) {
                  if (class468.field6451[arg1][var4] == null) {
                     var5 = class639.field9016.method732(var4, arg1, (byte)45);
                     if (var5 != null) {
                        var6 = class468.field6451[arg1][var4] = new class657();
                        var6.field9220 = (arg1 << 16) + var4;
                        if (var5[0] != -1) {
                           throw new IllegalStateException(field8413[6]);
                        }

                        var6.method4769(new class594(var5), -58);
                     }
                  }

                  ++var4;
               }

               while(true) {
                  while(var4 < var3) {
                     if (class468.field6451[arg1][var4] == null) {
                        var5 = class639.field9016.method732(var4, arg1, (byte)45);
                        if (var5 != null) {
                           var6 = class468.field6451[arg1][var4] = new class657();
                           var6.field9220 = (arg1 << 16) + var4;
                           if (var5[0] != -1) {
                              throw new IllegalStateException(field8413[6]);
                           }

                           var6.method4769(new class594(var5), -58);
                        }
                     }

                     ++var4;
                  }

                  class388.field5433[arg1] = true;
                  if (!var2) {
                     return true;
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field8413[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "<init>",
      descriptor = "()V"
   )
   protected class603() {
      try {
         this.field8405 = new int[0];
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8413[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4401(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4402(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
