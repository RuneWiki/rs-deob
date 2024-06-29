import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class323 {
   @OriginalMember(
      owner = "client!dja",
      name = "d",
      descriptor = "J"
   )
   public long field4604;
   @OriginalMember(
      owner = "client!dja",
      name = "f",
      descriptor = "Lck;"
   )
   private class667 field4601;
   @OriginalMember(
      owner = "client!dja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4606 = new String[]{method2445(method2444("9\u001aDB\u007fu")), method2445(method2444("3\u0005I\u0000")), method2445(method2444("&^\u000bBF")), method2445(method2444("9\u001aDBxu")), method2445(method2444("9\u001aDByu")), method2445(method2444("9\u001aDBzu")), method2445(method2444("9\u001aDB~u")), method2445(method2444("9\u001aDB]4\u001eD\u0000R'\u0015\r")), method2445(method2444("9\u001aDB\u00074\u001eL\u0018\u0005u"))};
   @OriginalMember(
      owner = "client!dja",
      name = "i",
      descriptor = "Lsd;"
   )
   public static class101 field4596 = new class101(50, 6);
   @OriginalMember(
      owner = "client!dja",
      name = "b",
      descriptor = "I"
   )
   public static int field4603 = 104;
   @OriginalMember(
      owner = "client!dja",
      name = "c",
      descriptor = "F"
   )
   public static float field4599;
   @OriginalMember(
      owner = "client!dja",
      name = "k",
      descriptor = "F"
   )
   public static float field4602;
   @OriginalMember(
      owner = "client!dja",
      name = "j",
      descriptor = "I"
   )
   public static int field4595;
   @OriginalMember(
      owner = "client!dja",
      name = "h",
      descriptor = "I"
   )
   public static int field4597;
   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "I"
   )
   public static int field4598;
   @OriginalMember(
      owner = "client!dja",
      name = "g",
      descriptor = "I"
   )
   public static int field4600;
   @OriginalMember(
      owner = "client!dja",
      name = "e",
      descriptor = "I"
   )
   public static int field4605;

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(IIZI)V",
      line = 6
   )
   public static final void method2439(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         if (arg3 > 26) {
            ++field4597;
            if (class204.field2628.method5681((long)arg1, -1) == null) {
               if (!class492.field7272) {
                  class67.method671(arg2, arg1, (byte)86);
               } else {
                  class664 var4 = new class664(arg1, new class213(4096, class525.field7630, arg1), arg0, arg2);
                  var4.field9657.method4099(class574.field8547[class728.field10827], 2);
                  class204.field2628.method5682((long)arg1, var4, (byte)7);
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4606[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(IILhv;BLha;)V",
      line = 36
   )
   public static final void method2440(int param0, int param1, class544 param2, byte param3, class66 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "([I[JI)V",
      line = 70
   )
   public static final void method2441(int[] arg0, long[] arg1, int arg2) {
      try {
         if (arg2 > -12) {
            field4602 = -0.6809445F;
         }

         ++field4595;
         class338.method2658(0, 0, arg1.length + -1, arg1, arg0);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4606[4] + (arg0 != null ? field4606[2] : field4606[1]) + ',' + (arg1 != null ? field4606[2] : field4606[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "finalize",
      descriptor = "()V",
      line = 81
   )
   protected final void finalize() throws Throwable {
      try {
         ++field4605;
         this.field4601.method4832((byte)-121, this.field4604);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4606[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(Z)V",
      line = 91
   )
   public static void method2442(boolean arg0) {
      try {
         field4596 = null;
         if (arg0) {
            field4599 = -0.8334505F;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4606[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(Ljava/lang/String;BILjava/lang/String;)V",
      line = 101
   )
   public static final void method2443(String arg0, byte arg1, int arg2, String arg3) {
      try {
         ++field4600;
         if (~arg0.length() >= -321) {
            if (class163.method1333(3)) {
               class5.method41((byte)-111);
               class149.field1859 = arg2;
               if (arg1 >= 65) {
                  class685.field10283 = arg0;
                  class397.field6109 = arg3;
                  class317.method2411(6, (byte)-87);
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4606[3] + (arg0 != null ? field4606[2] : field4606[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4606[2] : field4606[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "<init>",
      descriptor = "(Lck;J[Liga;)V",
      line = 127
   )
   public class323(class667 arg0, long arg1, class481[] arg2) {
      try {
         this.field4604 = arg1;
         this.field4601 = arg0;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4606[8] + (arg0 != null ? field4606[2] : field4606[1]) + ',' + arg1 + ',' + (arg2 != null ? field4606[2] : field4606[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2444(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2445(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
