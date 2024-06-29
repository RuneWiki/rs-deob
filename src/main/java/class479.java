import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class479 extends class258 {
   @OriginalMember(
      owner = "client!oda",
      name = "W",
      descriptor = "Ldea;"
   )
   private class471 field6891;
   @OriginalMember(
      owner = "client!oda",
      name = "X",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6895 = new String[]{method3669(method3668("D\u0019Y\u0007y\u0003")), method3669(method3668("E\bTE")), method3669(method3668("PS\u0016\u0007S")), method3669(method3668("D\u0019Y\u0007\u0012B\u0013Q]\u0010\u0003")), method3669(method3668("D\u0019Y\u0007gjU")), method3669(method3668("D\u0019Y\u0007fjU")), method3669(method3668("D\u0019Y\u0007djU")), method3669(method3668("B\u001c"))};
   @OriginalMember(
      owner = "client!oda",
      name = "P",
      descriptor = "Lfm;"
   )
   public static class164 field6889 = new class164(25, 3);
   @OriginalMember(
      owner = "client!oda",
      name = "T",
      descriptor = "I"
   )
   public static int field6887;
   @OriginalMember(
      owner = "client!oda",
      name = "U",
      descriptor = "I"
   )
   public static int field6888;
   @OriginalMember(
      owner = "client!oda",
      name = "S",
      descriptor = "I"
   )
   public static int field6890;
   @OriginalMember(
      owner = "client!oda",
      name = "V",
      descriptor = "Lhn;"
   )
   public static class357 field6892;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!oda",
      name = "Q",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field6894;
   @OriginalMember(
      owner = "client!oda",
      name = "R",
      descriptor = "[[[I"
   )
   public static int[][][] field6893;

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(Ldea;[Lpha;)V"
   )
   public static final void method3663(class471 arg0, class757[] arg1) {
      if (class572.field8100) {
         int var2 = arg0.method1681((byte)39, arg1);
         class720.field10315.method199(var2, arg1);
      }

      if (class634.field8989 == class225.field3197) {
         boolean var3 = false;
         boolean var4 = false;
         int var5;
         int var6;
         if (arg0 instanceof class578) {
            var5 = ((class578)arg0).field8154;
            var6 = ((class578)arg0).field8160;
         } else {
            var5 = arg0.field6832 >> class313.field4707;
            var6 = arg0.field6833 >> class313.field4707;
         }

         class720.field10315.method250(class558.field7922[0].method5401(arg0.field6832, true, arg0.field6833), class496.method3763(var5, var6), class15.method125(var5, var6), class700.method5117(var5, var6));
      }

      class731 var7 = arg0.method730(-110, class720.field10315);
      if (var7 != null) {
         if (arg0.field6838) {
            class213[] var8 = var7.field10397;

            for(int var9 = 0; var9 < var8.length; ++var9) {
               class213 var10 = var8[var9];
               if (var10.field3053) {
                  class515.method3870(var10.field3055 - var10.field3052, var10.field3056 + var10.field3052, (byte)-50, var10.field3052 + var10.field3051, var10.field3054 - var10.field3052);
               }
            }
         }

         if (var7.field10400) {
            var7.field10399 = arg0;
            if (class684.field9885) {
               class167 var11 = class416.field6098;
               synchronized(class416.field6098) {
                  class416.field6098.method1568(-14312, var7);
                  return;
               }
            }

            class416.field6098.method1568(-14312, var7);
            return;
         }

         class267.method2282(var7, -7073);
      }

   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(ILha;I)Z"
   )
   public static final boolean method3664(int param0, class17 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oda",
      name = "<init>",
      descriptor = "(Ldea;Z)V"
   )
   public class479(class471 arg0, boolean arg1) {
      super(arg1);

      try {
         this.field6891 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6895[3] + (arg0 != null ? field6895[2] : field6895[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3665(int arg0, int arg1, int arg2) {
      try {
         if (arg0 <= 53) {
            return false;
         } else {
            ++field6890;
            return (class512.method3859(arg1, 544, arg2) | (arg1 & 8192) != 0 | class662.method4804(arg2, (byte)-57, arg1)) & class284.method2376(arg1, arg2, -89);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6895[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method3666(int arg0) {
      try {
         field6892 = null;
         if (arg0 == 2883872) {
            field6893 = null;
            field6889 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6895[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(Luf;BI)V"
   )
   public final void method861(class33 arg0, byte arg1, int arg2) {
      try {
         class66.method708(arg0, this.field6891, true, arg2);
         int var4 = 48 / ((arg1 - -23) / 57);
         ++field6888;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6895[0] + (arg0 != null ? field6895[2] : field6895[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!oda",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3667(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3668(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3669(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
