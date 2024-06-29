import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class794 extends class575 {
   @OriginalMember(
      owner = "client!fl",
      name = "o",
      descriptor = "F"
   )
   private float field11544 = 0.0F;
   @OriginalMember(
      owner = "client!fl",
      name = "x",
      descriptor = "Lqc;"
   )
   private class497 field11549;
   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11556 = new String[]{method5726(method5725("Mw&s?")), method5726(method5725("P5&a+X0|cj")), method5726(method5725("X,d1")), method5726(method5725("P5&\u001fj")), method5726(method5725("P5&\u001bj")), method5726(method5725("P5&\u001ej")), method5726(method5725("P5&\u001cj")), method5726(method5725("P5&\u0018j")), method5726(method5725("P5&\u0016j")), method5726(method5725("P5&\u0019j")), method5726(method5725("P5&\u001aj"))};
   @OriginalMember(
      owner = "client!fl",
      name = "w",
      descriptor = "Lfm;"
   )
   public static class164 field11548 = new class164(33, -1);
   @OriginalMember(
      owner = "client!fl",
      name = "t",
      descriptor = "Lhha;"
   )
   public static class724 field11553 = new class724(119, -1);
   @OriginalMember(
      owner = "client!fl",
      name = "u",
      descriptor = "I"
   )
   public static int field11554 = 0;
   @OriginalMember(
      owner = "client!fl",
      name = "p",
      descriptor = "I"
   )
   public static int field11543;
   @OriginalMember(
      owner = "client!fl",
      name = "s",
      descriptor = "I"
   )
   public static int field11545;
   @OriginalMember(
      owner = "client!fl",
      name = "m",
      descriptor = "I"
   )
   public static int field11546;
   @OriginalMember(
      owner = "client!fl",
      name = "l",
      descriptor = "I"
   )
   public static int field11547;
   @OriginalMember(
      owner = "client!fl",
      name = "r",
      descriptor = "I"
   )
   public static int field11550;
   @OriginalMember(
      owner = "client!fl",
      name = "q",
      descriptor = "I"
   )
   public static int field11551;
   @OriginalMember(
      owner = "client!fl",
      name = "v",
      descriptor = "I"
   )
   public static int field11552;
   @OriginalMember(
      owner = "client!fl",
      name = "n",
      descriptor = "Lwe;"
   )
   public static class195 field11555;

   @OriginalMember(
      owner = "client!fl",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method5723(byte arg0) {
      try {
         field11553 = null;
         int var1 = 109 / ((20 - arg0) / 54);
         field11555 = null;
         field11548 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11556[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "([Ldea;II)V"
   )
   public static final void method5724(class471[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var3 = (arg1 + arg2) / 2;
         int var4 = arg1;
         class471 var5 = arg0[var3];
         arg0[var3] = arg0[arg2];
         arg0[arg2] = var5;
         int var6 = var5.field6837;

         for(int var7 = arg1; var7 < arg2; ++var7) {
            if (arg0[var7].field6837 > (var7 & 1) + var6) {
               class471 var8 = arg0[var7];
               arg0[var7] = arg0[var4];
               arg0[var4++] = var8;
            }
         }

         arg0[arg2] = arg0[var4];
         arg0[var4] = var5;
         method5724(arg0, arg1, var4 - 1);
         method5724(arg0, var4 + 1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!fl",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method85(boolean arg0) {
      try {
         super.field8129.method1953(-13, 1);
         ++field11543;
         if (arg0) {
            this.method3465((byte)57);
         }

         super.field8129.method1945((byte)-86, class561.field7986, class561.field7986);
         super.field8129.method2009(0, 0, class339.field5001);
         super.field8129.method1937(class339.field5001, 0, 0);
         super.field8129.method1284(112, 1);
         super.field8129.method1943(0, (class683)null);
         super.field8129.method1953(107, 0);
         super.field8129.method1937(class339.field5001, 0, 0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11556[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3465(byte arg0) {
      try {
         if (arg0 == -15) {
            if (~super.field8129.method1970((byte)-75) == -1) {
               class522 var2 = super.field8129.method1956(28194);
               super.field8129.method1953(-127, 1);
               class522 var3 = super.field8129.method1992((byte)81);
               var3.method323(var2);
               var3.method3906((byte)-106, 0.125F, 1.0F, 0.125F);
               var3.method3900(this.field11544, -8241, 0.0F, 0.0F);
               super.field8129.method2015(class303.field4584, (byte)119);
               super.field8129.method1953(-83, 0);
            }

            ++field11551;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11556[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method84(int arg0, int arg1, byte arg2) {
      boolean var4 = client.field10022;

      try {
         label41: {
            super.field8129.method1953(-24, 1);
            ++field11547;
            if ((128 & arg1) == 0) {
               if (~(arg0 & 1) != -2) {
                  if (!this.field11549.field7090) {
                     super.field8129.method1943(0, this.field11549.field7085[0]);
                     if (!var4) {
                        break label41;
                     }
                  }

                  super.field8129.method1943(0, this.field11549.field7083);
                  if (!var4) {
                     break label41;
                  }
               }

               if (!this.field11549.field7090) {
                  int var5 = super.field8129.field3488 % 4000 * 16 / 4000;
                  super.field8129.method1943(0, this.field11549.field7085[var5]);
                  if (!var4) {
                     break label41;
                  }
               }

               this.field11544 = (float)(super.field8129.field3488 % 4000) / 4000.0F;
               super.field8129.method1943(0, this.field11549.field7083);
               if (!var4) {
                  break label41;
               }
            }

            super.field8129.method1943(0, (class683)null);
         }

         super.field8129.method1953(-37, 0);
         if (arg2 < 61) {
            this.field11544 = 1.7882888F;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field11556[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method86(int arg0) {
      try {
         ++field11552;
         if (arg0 != 15385) {
            this.method87(false, true);
         }

         return this.field11549.method3771(true);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11556[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "<init>",
      descriptor = "(Ldaa;Lqc;)V"
   )
   public class794(class226 arg0, class497 arg1) {
      super(arg0);

      try {
         this.field11549 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11556[1] + (arg0 != null ? field11556[0] : field11556[2]) + ',' + (arg1 != null ? field11556[0] : field11556[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method82(boolean arg0, byte arg1) {
      try {
         if (arg1 != 23) {
            this.method82(false, (byte)125);
         }

         super.field8129.method1945((byte)-86, class74.field1189, class561.field7986);
         ++field11545;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11556[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method87(boolean arg0, boolean arg1) {
      try {
         super.field8129.method1953(102, 1);
         ++field11550;
         super.field8129.method1945((byte)-86, class74.field1189, class717.field10280);
         super.field8129.method1239(2, class339.field5001, 0, arg1, false);
         super.field8129.method1937(class77.field1238, 0, 0);
         super.field8129.method1284(113, 0);
         super.field8129.method1953(-65, 0);
         super.field8129.method1939(-16777216, (byte)-60);
         super.field8129.method1937(class172.field2572, 0, 0);
         this.method3465((byte)-15);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11556[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(IZLqf;)V"
   )
   public final void method88(int arg0, boolean arg1, class683 arg2) {
      try {
         ++field11546;
         if (!arg1) {
            field11548 = null;
         }

         super.field8129.method1943(0, arg2);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11556[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11556[0] : field11556[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5725(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5726(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
