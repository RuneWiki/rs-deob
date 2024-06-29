import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class721 extends class683 implements class398 {
   @OriginalMember(
      owner = "client!hg",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10541 = new String[]{method5247(method5246("6>\u001eV\u0002")), method5247(method5246("0,\\\u007f")), method5247(method5246("%w\u001e=W")), method5247(method5246("6>\u001e[\u0002")), method5247(method5246("6>\u001eU\u0002")), method5247(method5246("6>\u001eP\u0002")), method5247(method5246("6>\u001eX\u0002")), method5247(method5246("6>\u001eZ\u0002")), method5247(method5246("6>\u001eW\u0002")), method5247(method5246("6>\u001eQ\u0002")), method5247(method5246("6>\u001eR\u0002")), method5247(method5246("6>\u001eY\u0002"))};
   @OriginalMember(
      owner = "client!hg",
      name = "I",
      descriptor = "Lek;"
   )
   public static class536 field10529 = new class536(33, -1);
   @OriginalMember(
      owner = "client!hg",
      name = "B",
      descriptor = "Leg;"
   )
   public static class118 field10538 = new class118(125, -1);
   @OriginalMember(
      owner = "client!hg",
      name = "G",
      descriptor = "Lek;"
   )
   public static class536 field10539 = new class536(71, 0);
   @OriginalMember(
      owner = "client!hg",
      name = "K",
      descriptor = "I"
   )
   public static int field10540 = -50;
   @OriginalMember(
      owner = "client!hg",
      name = "D",
      descriptor = "B"
   )
   private byte field10537;
   @OriginalMember(
      owner = "client!hg",
      name = "A",
      descriptor = "I"
   )
   public static int field10527;
   @OriginalMember(
      owner = "client!hg",
      name = "x",
      descriptor = "I"
   )
   public static int field10528;
   @OriginalMember(
      owner = "client!hg",
      name = "E",
      descriptor = "I"
   )
   public static int field10530;
   @OriginalMember(
      owner = "client!hg",
      name = "w",
      descriptor = "I"
   )
   public static int field10531;
   @OriginalMember(
      owner = "client!hg",
      name = "y",
      descriptor = "I"
   )
   public static int field10532;
   @OriginalMember(
      owner = "client!hg",
      name = "H",
      descriptor = "I"
   )
   public static int field10533;
   @OriginalMember(
      owner = "client!hg",
      name = "F",
      descriptor = "I"
   )
   public static int field10534;
   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "I"
   )
   public static int field10535;
   @OriginalMember(
      owner = "client!hg",
      name = "C",
      descriptor = "I"
   )
   public static int field10536;

   @OriginalMember(
      owner = "client!hg",
      name = "c",
      descriptor = "(B)[Lwu;",
      line = 3
   )
   public static final class395[] method5242(byte arg0) {
      try {
         if (arg0 >= -91) {
            field10529 = null;
         }

         ++field10531;
         return new class395[]{class64.field783, class286.field3960, class318.field4331, class123.field1594, class94.field1221, class601.field8838, class384.field5583, class507.field7376, class226.field3208, class649.field9475, class100.field1285, class649.field9482, class685.field10098, class635.field9286};
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10541[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Z)I",
      line = 16
   )
   public final int method1408(boolean arg0) {
      try {
         if (!arg0) {
            field10529 = null;
         }

         ++field10527;
         return super.method1408(true);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10541[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(ZZ)Ljaclib/memory/Buffer;",
      line = 27
   )
   public final Buffer method1407(boolean arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method1407(true, false);
         }

         ++field10535;
         return super.method4984(arg0, (byte)-41, super.field10047.field7152);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10541[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "b",
      descriptor = "(I)V",
      line = 42
   )
   public static void method5243(int arg0) {
      try {
         field10529 = null;
         if (arg0 == 10818) {
            field10538 = null;
            field10539 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10541[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "b",
      descriptor = "(B)V",
      line = 54
   )
   public static final void method5244(byte arg0) {
      try {
         ++field10528;
         class227 var1 = (class227)class96.field1233.method2933(2);
         int var2 = 101 / ((arg0 - 40) / 63);
         boolean var3 = class182.field2549 != null || ~class610.field8961 < -1;
         int var4 = var1.method481((byte)35);
         int var5 = var1.method482((byte)-112);
         if (var3) {
            class666.field9666 = 1;
         }

         if (!var3) {
            class719.method5229(class521.field7496, var4, var5, (byte)-83);
         } else {
            class194.field2756 = class521.field7496;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field10541[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "c",
      descriptor = "(I)I",
      line = 85
   )
   public final int method5245(int arg0) {
      try {
         ++field10534;
         if (arg0 != -17438) {
            field10529 = null;
         }

         return this.field10537;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10541[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(B)Z",
      line = 97
   )
   public final boolean method1409(byte arg0) {
      try {
         int var2 = 38 / ((arg0 - -7) / 61);
         ++field10532;
         return super.method4982(true, super.field10047.field7152);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10541[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(III)Z",
      line = 107
   )
   public final boolean method1410(int arg0, int arg1, int arg2) {
      try {
         this.field10537 = (byte)arg1;
         if (arg2 <= 46) {
            this.field10537 = 88;
         }

         ++field10533;
         super.method2281(-4657, arg0);
         return true;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10541[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(Ljaclib/memory/Source;III)Z",
      line = 125
   )
   public final boolean method1413(Source arg0, int arg1, int arg2, int arg3) {
      try {
         ++field10530;
         this.field10537 = (byte)arg1;
         if (arg3 != -10823) {
            method5244((byte)9);
         }

         super.method4977((byte)-104, arg0, arg2);
         return true;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10541[0] + (arg0 != null ? field10541[2] : field10541[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "a",
      descriptor = "(I)V",
      line = 140
   )
   public final void method1412(int arg0) {
      try {
         if (arg0 > 6) {
            ++field10536;
            super.method1412(64);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10541[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hg",
      name = "<init>",
      descriptor = "(Lwi;Z)V",
      line = 156
   )
   public class721(class494 arg0, boolean arg1) {
      super(arg0, 34962, arg1);
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5246(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5247(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
