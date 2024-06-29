import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class263 extends class454 {
   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3340 = new String[]{method2112(method2111("\u0007/ Z M")), method2112(method2111("\u000b<-\u0018")), method2112(method2111("\u001egoZ\u001b")), method2112(method2111("\u0007/ Z%M")), method2112(method2111("\u0007/ Z\"M")), method2112(method2111("\u0007/ Z!M")), method2112(method2111("\u0007/ Z'M")), method2112(method2111("\u0007/ Z$M")), method2112(method2111("\u0007/ Z.M")), method2112(method2111("\u0007/ Z#M"))};
   @OriginalMember(
      owner = "client!bfa",
      name = "m",
      descriptor = "I"
   )
   public static int field3332;
   @OriginalMember(
      owner = "client!bfa",
      name = "i",
      descriptor = "I"
   )
   public static int field3333;
   @OriginalMember(
      owner = "client!bfa",
      name = "p",
      descriptor = "I"
   )
   public static int field3334;
   @OriginalMember(
      owner = "client!bfa",
      name = "j",
      descriptor = "I"
   )
   public static int field3335;
   @OriginalMember(
      owner = "client!bfa",
      name = "l",
      descriptor = "I"
   )
   public static int field3336;
   @OriginalMember(
      owner = "client!bfa",
      name = "n",
      descriptor = "I"
   )
   public static int field3337;
   @OriginalMember(
      owner = "client!bfa",
      name = "o",
      descriptor = "I"
   )
   public static int field3338;
   @OriginalMember(
      owner = "client!bfa",
      name = "k",
      descriptor = "Ltu;"
   )
   public static class262 field3339;

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            return 80;
         } else {
            ++field3333;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3340[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2107(int arg0) {
      try {
         if (arg0 != -18033) {
            method2108(-38);
         }

         ++field3334;
         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3340[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         super.field6263 = arg1;
         if (arg0 >= -46) {
            field3339 = null;
         }

         ++field3335;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3340[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class263(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         ++field3338;
         if (arg0) {
            if (super.field6259.method5434((byte)-119)) {
               super.field6263 = 0;
            }

            if (super.field6263 != 1 && super.field6263 != 0) {
               super.field6263 = this.method23(1);
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3340[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2108(int arg0) {
      try {
         if (arg0 != 3) {
            method2110(113, (class642)null, -113, 86);
         }

         field3339 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3340[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            field3339 = null;
         }

         ++field3336;
         return super.field6259.method5434((byte)-119) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3340[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method2109(boolean arg0) {
      try {
         ++field3332;
         if (super.field6259.method5434((byte)-118)) {
            return false;
         } else {
            if (arg0) {
               field3339 = null;
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3340[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class263(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(ILoca;II)V"
   )
   public static final void method2110(int arg0, class642 arg1, int arg2, int arg3) {
      try {
         ++field3337;
         if (arg1 != null) {
            if (arg1.field9544 != null) {
               class586 var4 = new class586();
               var4.field8648 = arg1.field9544;
               var4.field8655 = arg1;
               class256.method2064(var4);
            }

            class226.field2826 = arg1.field9524;
            class597.field8823 = true;
            class26.field392 = arg1.field9482;
            class741.field10841 = arg1.field9537;
            class436.field5949 = arg1.field9592;
            class112.field1500 = arg3;
            if (arg2 != -14332) {
               field3339 = null;
            }

            class268.field3427 = arg0;
            class371.field5188 = arg1.field9518;
            class49.method372(arg1, 0);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3340[3] + arg0 + ',' + (arg1 != null ? field3340[2] : field3340[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2111(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2112(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
