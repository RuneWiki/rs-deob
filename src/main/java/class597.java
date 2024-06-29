import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class597 implements class505 {
   @OriginalMember(
      owner = "client!im",
      name = "l",
      descriptor = "Leaa;"
   )
   private class526 field8796;
   @OriginalMember(
      owner = "client!im",
      name = "b",
      descriptor = "Leaa;"
   )
   private class526 field8791;
   @OriginalMember(
      owner = "client!im",
      name = "g",
      descriptor = "Ltca;"
   )
   private class183 field8790;
   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8798 = new String[]{method4376(method4375("\u000f\b#S\u0006")), method4376(method4375("\b\u0010a~")), method4376(method4375("\u000f\b#T\u0006")), method4376(method4375("\u001dK#<S")), method4376(method4375("\u000f\b#.G\b\fy,\u0006")), method4376(method4375("\u000f\b#V\u0006")), method4376(method4375("\u000f\b#Q\u0006")), method4376(method4375("\u000f\b#P\u0006")), method4376(method4375("\u000f\b#W\u0006")), method4376(method4375("\u000f\b#[\u0006"))};
   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "[Lld;"
   )
   public static class180[] field8794 = new class180[300];
   @OriginalMember(
      owner = "client!im",
      name = "c",
      descriptor = "I"
   )
   public static int field8786;
   @OriginalMember(
      owner = "client!im",
      name = "j",
      descriptor = "I"
   )
   public static int field8787;
   @OriginalMember(
      owner = "client!im",
      name = "e",
      descriptor = "I"
   )
   public static int field8788;
   @OriginalMember(
      owner = "client!im",
      name = "m",
      descriptor = "I"
   )
   public static int field8789;
   @OriginalMember(
      owner = "client!im",
      name = "i",
      descriptor = "I"
   )
   public static int field8792;
   @OriginalMember(
      owner = "client!im",
      name = "f",
      descriptor = "I"
   )
   public static int field8795;
   @OriginalMember(
      owner = "client!im",
      name = "k",
      descriptor = "Lwk;"
   )
   public static class152 field8793;
   @OriginalMember(
      owner = "client!im",
      name = "h",
      descriptor = "Lop;"
   )
   public static class200 field8785;
   @OriginalMember(
      owner = "client!im",
      name = "d",
      descriptor = "Lda;"
   )
   private class67 field8797;

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(Z)Z",
      line = 4
   )
   public final boolean method168(boolean arg0) {
      try {
         ++field8789;
         if (arg0) {
            method4371(103);
         }

         boolean var2 = true;
         if (!this.field8791.method3884((byte)-99, this.field8790.field2280)) {
            var2 = false;
         }

         if (!this.field8796.method3884((byte)-99, this.field8790.field2280)) {
            var2 = false;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8798[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "b",
      descriptor = "(I)V",
      line = 33
   )
   public static void method4371(int arg0) {
      try {
         if (arg0 == -21973) {
            field8785 = null;
            field8793 = null;
            field8794 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8798[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(I)V",
      line = 50
   )
   public final void method165(int arg0) {
      try {
         if (arg0 == 25668) {
            ++field8787;
            class763 var2 = class145.method1203((byte)79, this.field8796, this.field8790.field2280);
            this.field8797 = class786.field11439.method570(var2, class671.method4884(this.field8791, this.field8790.field2280), true);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8798[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(IIB)Z",
      line = 65
   )
   public static final boolean method4372(int arg0, int arg1, byte arg2) {
      try {
         ++field8788;
         if (arg2 != -44) {
            return true;
         } else {
            return ~(34 & arg1) != -1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8798[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(BLeaa;)V",
      line = 81
   )
   public static final void method4373(byte arg0, class526 arg1) {
      try {
         class705.field10555 = arg1;
         ++field8795;
         if (arg0 < 104) {
            method4373((byte)-65, (class526)null);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8798[2] + arg0 + ',' + (arg1 != null ? field8798[3] : field8798[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(ZI)V",
      line = 93
   )
   public final void method90(boolean arg0, int arg1) {
      try {
         if (arg0) {
            int var3 = this.field8790.field2262.method4343(90, class189.field2365, this.field8790.field2272) - -this.field8790.field2271;
            int var4 = this.field8790.field2273.method2922(class663.field9630, 113, this.field8790.field2263) - -this.field8790.field2277;
            this.field8797.method664(var3, this.field8790.field2270, var4, 0, this.field8790.field2265, this.field8790.field2278, this.field8790.field2276, (class512)null, (class396[])null, 0, this.field8790.field2267, -1, (int[])null, this.field8790.field2263, this.field8790.field2272, this.field8790.field2264);
         }

         ++field8786;
         int var5 = -125 / ((arg1 - -91) / 35);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8798[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "<init>",
      descriptor = "(Leaa;Leaa;Ltca;)V",
      line = 110
   )
   public class597(class526 arg0, class526 arg1, class183 arg2) {
      try {
         this.field8796 = arg1;
         this.field8791 = arg0;
         this.field8790 = arg2;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8798[4] + (arg0 != null ? field8798[3] : field8798[1]) + ',' + (arg1 != null ? field8798[3] : field8798[1]) + ',' + (arg2 != null ? field8798[3] : field8798[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(IILlw;ILde;IILct;)V",
      line = 120
   )
   public static final void method4374(int arg0, int arg1, class687 arg2, int arg3, class557 arg4, int arg5, int arg6, class155 arg7) {
      try {
         if (arg0 == 1111756009) {
            ++field8792;
            class552 var8 = new class552();
            var8.field8164 = arg3 << 9;
            var8.field8179 = arg6 << 9;
            var8.field8178 = arg5;
            if (arg4 == null) {
               if (arg7 != null) {
                  var8.field8172 = arg7;
                  class369 var9 = arg7.field1971;
                  if (var9.field5590 != null) {
                     var8.field8197 = true;
                     var9 = var9.method2872(true, field8793);
                  }

                  if (var9 != null) {
                     var8.field8192 = var9.field5589 + arg3 << 9;
                     var8.field8183 = var9.field5589 + arg6 << 9;
                     var8.field8169 = class168.method1356(arg7, 0);
                     var8.field8193 = var9.field5558;
                     var8.field8174 = var9.field5604 << 9;
                     var8.field8163 = var9.field5609;
                     var8.field8194 = var9.field5617;
                     var8.field8170 = var9.field5563;
                     var8.field8173 = var9.field5602 << 9;
                  }

                  class33.field359.method4060(23, var8);
                  return;
               }

               if (arg2 != null) {
                  var8.field8196 = arg2;
                  var8.field8183 = arg2.method3046(-52) + arg6 << 9;
                  var8.field8192 = arg2.method3046(-117) + arg3 << 9;
                  var8.field8169 = class555.method4107(arg2, 88);
                  var8.field8173 = 0;
                  var8.field8163 = arg2.field10331;
                  var8.field8170 = arg2.field10326;
                  var8.field8174 = arg2.field10311 << 9;
                  var8.field8193 = 256;
                  var8.field8194 = 256;
                  class450.field6839.method5682((long)arg2.field6027, var8, (byte)7);
                  return;
               }
            } else {
               var8.field8171 = arg4;
               int var10 = arg4.field8357;
               int var11 = arg4.field8350;
               if (arg1 == 1 || arg1 == 3) {
                  var11 = arg4.field8357;
                  var10 = arg4.field8350;
               }

               var8.field8163 = arg4.field8316;
               var8.field8192 = arg3 - -var11 << 9;
               var8.field8189 = arg4.field8331;
               var8.field8173 = arg4.field8268 << 9;
               var8.field8170 = arg4.field8303;
               var8.field8174 = arg4.field8355 << 9;
               var8.field8183 = arg6 - -var10 << 9;
               var8.field8166 = arg4.field8285;
               var8.field8193 = arg4.field8359;
               var8.field8194 = arg4.field8322;
               var8.field8175 = arg4.field8291;
               var8.field8181 = arg4.field8294;
               var8.field8169 = arg4.field8319;
               if (arg4.field8320 != null) {
                  var8.field8197 = true;
                  var8.method4085(arg0 + -1111755960);
               }

               if (var8.field8181 != null) {
                  var8.field8165 = var8.field8166 - -((int)((double)(-var8.field8166 + var8.field8175) * Math.random()));
               }

               class256.field3455.method4060(23, var8);
            }

         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field8798[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8798[3] : field8798[1]) + ',' + arg3 + ',' + (arg4 != null ? field8798[3] : field8798[1]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field8798[3] : field8798[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4375(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4376(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
