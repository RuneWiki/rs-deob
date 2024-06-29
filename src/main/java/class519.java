import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class519 {
   @OriginalMember(
      owner = "client!mi",
      name = "c",
      descriptor = "Lgw;"
   )
   private class179 field7578 = new class179(64);
   @OriginalMember(
      owner = "client!mi",
      name = "b",
      descriptor = "Lhw;"
   )
   private class141 field7575;
   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7581 = new String[]{method3923(method3922("B0\u0016 -")), method3923(method3922("B0\u0016%-")), method3923(method3922("A,T\u000b")), method3923(method3922("B0\u0016[lA0LY-")), method3923(method3922("Tw\u0016Ix")), method3923(method3922("B0\u0016&-")), method3923(method3922("B0\u0016$-")), method3923(method3922("B0\u0016/-")), method3923(method3922("B0\u0016!-")), method3923(method3922("B0\u0016\"-")), method3923(method3922("B0\u0016#-"))};
   @OriginalMember(
      owner = "client!mi",
      name = "k",
      descriptor = "[Lkd;"
   )
   public static class295[] field7579 = new class295[14];
   @OriginalMember(
      owner = "client!mi",
      name = "h",
      descriptor = "I"
   )
   public static int field7571;
   @OriginalMember(
      owner = "client!mi",
      name = "d",
      descriptor = "I"
   )
   public static int field7572;
   @OriginalMember(
      owner = "client!mi",
      name = "f",
      descriptor = "I"
   )
   public static int field7573;
   @OriginalMember(
      owner = "client!mi",
      name = "e",
      descriptor = "I"
   )
   public static int field7574;
   @OriginalMember(
      owner = "client!mi",
      name = "j",
      descriptor = "I"
   )
   public static int field7576;
   @OriginalMember(
      owner = "client!mi",
      name = "i",
      descriptor = "I"
   )
   public static int field7577;
   @OriginalMember(
      owner = "client!mi",
      name = "g",
      descriptor = "I"
   )
   public static int field7580;
   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "Lsm;"
   )
   public static class297 field7570;

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(BI)Ljp;"
   )
   public final class372 method3914(byte arg0, int arg1) {
      try {
         ++field7573;
         class179 var3 = this.field7578;
         class372 var4;
         synchronized(this.field7578) {
            var4 = (class372)this.field7578.method1584((long)arg1, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field7575;
            byte[] var6;
            synchronized(this.field7575) {
               var6 = this.field7575.method1347((byte)122, 35, arg1);
            }

            if (arg0 <= 124) {
               this.field7578 = null;
            }

            class372 var7 = new class372();
            if (var6 != null) {
               var7.method2908(new class473(var6), (byte)14);
            }

            var7.method2909(39);
            class179 var8 = this.field7578;
            synchronized(this.field7578) {
               this.field7578.method1581((long)arg1, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field7581[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3915(int arg0) {
      try {
         ++field7572;
         class179 var2 = this.field7578;
         synchronized(this.field7578) {
            this.field7578.method1591((byte)58);
         }

         int var3 = -53 % ((35 - arg0) / 48);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7581[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3916(byte arg0) {
      try {
         if (arg0 <= 119) {
            method3919(94);
         }

         field7570 = null;
         field7579 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7581[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3917(int arg0, byte arg1) {
      try {
         class179 var3 = this.field7578;
         synchronized(this.field7578) {
            this.field7578.method1579(-9, arg0);
            if (arg1 != 5) {
               this.method3917(-128, (byte)94);
            }
         }

         ++field7574;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field7581[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3918(boolean arg0) {
      try {
         class179 var2 = this.field7578;
         synchronized(this.field7578) {
            this.field7578.method1589((byte)90);
         }

         ++field7577;
         if (arg0) {
            field7579 = null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7581[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3919(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method3920(int arg0) {
      try {
         ++field7576;
         if (class411.field6023 == null) {
            return false;
         } else {
            if (~class411.field6023.field8485 <= -2001) {
               class411.field6023.field8485 -= 2000;
            }

            return (short)arg0 == class411.field6023.field8485;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7581[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(IZIII)V"
   )
   public static final void method3921(int param0, boolean param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mi",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V"
   )
   public class519(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field7575 = arg2;
         if (this.field7575 != null) {
            this.field7575.method1346(35, 0);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7581[3] + (arg0 != null ? field7581[4] : field7581[2]) + ',' + arg1 + ',' + (arg2 != null ? field7581[4] : field7581[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3922(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3923(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
