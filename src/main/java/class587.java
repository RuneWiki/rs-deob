import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class587 {
   @OriginalMember(
      owner = "client!tv",
      name = "b",
      descriptor = "Loi;"
   )
   private class80 field8678 = new class80(64);
   @OriginalMember(
      owner = "client!tv",
      name = "c",
      descriptor = "Lkf;"
   )
   private class266 field8674;
   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8682 = new String[]{method4279(method4278("r\bSD")), method4279(method4278("gS\u0011\u0006N")), method4279(method4278("h\u000b\u0011\u0014Zr\u0014K\u0016\u001b")), method4279(method4278("h\u000b\u0011j\u001b")), method4279(method4278("h\u000b\u0011i\u001b")), method4279(method4278("h\u000b\u0011l\u001b")), method4279(method4278("h\u000b\u0011n\u001b")), method4279(method4278("h\u000b\u0011k\u001b")), method4279(method4278("h\u000b\u0011m\u001b"))};
   @OriginalMember(
      owner = "client!tv",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field8677 = true;
   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field8681 = false;
   @OriginalMember(
      owner = "client!tv",
      name = "i",
      descriptor = "I"
   )
   public static int field8671;
   @OriginalMember(
      owner = "client!tv",
      name = "f",
      descriptor = "I"
   )
   public static int field8672;
   @OriginalMember(
      owner = "client!tv",
      name = "j",
      descriptor = "I"
   )
   public static int field8673;
   @OriginalMember(
      owner = "client!tv",
      name = "k",
      descriptor = "I"
   )
   public static int field8675;
   @OriginalMember(
      owner = "client!tv",
      name = "h",
      descriptor = "I"
   )
   public static int field8676;
   @OriginalMember(
      owner = "client!tv",
      name = "g",
      descriptor = "I"
   )
   public static int field8679;
   @OriginalMember(
      owner = "client!tv",
      name = "e",
      descriptor = "I"
   )
   public static int field8680;

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public final void method4272(int arg0) {
      try {
         ++field8671;
         class80 var2 = this.field8678;
         synchronized(this.field8678) {
            this.field8678.method731(0);
            int var3 = 82 % ((29 - arg0) / 62);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8682[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)I",
      line = 16
   )
   public static final int method4273(String arg0, boolean arg1) {
      boolean var2 = client.field4360;

      try {
         ++field8676;
         int var3 = arg0.length();
         int var4 = 0;
         int var5 = 0;
         if (arg1) {
            method4273((String)null, false);
            if (var2) {
               var4 = (var4 << 5) + (-var4 - -class217.method1714(arg0.charAt(var5), (byte)-117));
               ++var5;
            }
         }

         while(true) {
            while(var3 > var5) {
               var4 = (var4 << 5) + (-var4 - -class217.method1714(arg0.charAt(var5), (byte)-117));
               ++var5;
            }

            if (!var2) {
               return var4;
            }

            var4 = var4;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8682[8] + (arg0 != null ? field8682[1] : field8682[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(II)Lcca;",
      line = 38
   )
   public final class260 method4274(int arg0, int arg1) {
      try {
         ++field8680;
         class80 var3 = this.field8678;
         class260 var4;
         synchronized(this.field8678) {
            var4 = (class260)this.field8678.method725(0, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field8674;
            byte[] var6;
            synchronized(this.field8674) {
               var6 = this.field8674.method2037(false, class521.method3784((byte)125, arg1), class738.method5354(arg1, (byte)20));
            }

            class260 var7 = new class260();
            if (var6 != null) {
               var7.method1995(new class147(var6), (byte)103);
            }

            class80 var8 = this.field8678;
            synchronized(this.field8678) {
               this.field8678.method723(arg0, (long)arg1, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field8682[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "b",
      descriptor = "(II)V",
      line = 68
   )
   public final void method4275(int arg0, int arg1) {
      try {
         ++field8679;
         class80 var3 = this.field8678;
         synchronized(this.field8678) {
            this.field8678.method726(arg1, 25324);
         }

         if (arg0 != 0) {
            method4273((String)null, false);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8682[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(B)V",
      line = 81
   )
   public final void method4276(byte arg0) {
      try {
         ++field8672;
         class80 var2 = this.field8678;
         synchronized(this.field8678) {
            this.field8678.method715(true);
            if (arg0 != -88) {
               method4273((String)null, true);
            }

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8682[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "a",
      descriptor = "(IB)V",
      line = 99
   )
   public final void method4277(int arg0, byte arg1) {
      try {
         ++field8673;
         class80 var3 = this.field8678;
         synchronized(this.field8678) {
            this.field8678.method731(0);
            if (arg1 == -34) {
               this.field8678 = new class80(arg0);
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field8682[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V",
      line = 129
   )
   public class587(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field8674 = arg2;
         if (this.field8674 != null) {
            int var4 = this.field8674.method2027((byte)-121) + -1;
            this.field8674.method2060(2, var4);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8682[2] + (arg0 != null ? field8682[1] : field8682[0]) + ',' + arg1 + ',' + (arg2 != null ? field8682[1] : field8682[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4278(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4279(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
