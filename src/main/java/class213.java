import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class213 extends class622 {
   @OriginalMember(
      owner = "client!oc",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3187 = new String[]{method1818(method1817("#\u0014{6v")), method1818(method1817("#\u0014{$v")), method1818(method1817("#\u0014{\"v")), method1818(method1817("#\u0014{#v")), method1818(method1817("#\u0014{%v")), method1818(method1817("#\u0014{'v"))};
   @OriginalMember(
      owner = "client!oc",
      name = "D",
      descriptor = "Luw;"
   )
   public static class435 field3185 = new class435(41, 3);
   @OriginalMember(
      owner = "client!oc",
      name = "I",
      descriptor = "I"
   )
   public static int field3180;
   @OriginalMember(
      owner = "client!oc",
      name = "C",
      descriptor = "I"
   )
   public static int field3181;
   @OriginalMember(
      owner = "client!oc",
      name = "G",
      descriptor = "I"
   )
   public static int field3182;
   @OriginalMember(
      owner = "client!oc",
      name = "H",
      descriptor = "I"
   )
   public static int field3184;
   @OriginalMember(
      owner = "client!oc",
      name = "E",
      descriptor = "I"
   )
   public static int field3186;
   @OriginalMember(
      owner = "client!oc",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field3183;

   @OriginalMember(
      owner = "client!oc",
      name = "b",
      descriptor = "(Z)[Lqda;"
   )
   public static final class112[] method1811(boolean arg0) {
      try {
         if (arg0) {
            return null;
         } else {
            ++field3184;
            return new class112[]{class587.field8481, class147.field2387, class470.field6831};
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3187[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(FZ)V"
   )
   public final void method1812(float arg0, boolean arg1) {
      try {
         if (arg1) {
            this.method1814(35, -100, (byte)-51, -102);
         }

         ++field3182;
         super.field9076 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3187[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1813(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         if (arg2 != 32493) {
            method1811(false);
         }

         ++field3186;
         if (class393.field5787 != null) {
            label62: {
               int var4 = class547.field7911;
               int var5 = class124.field2039;
               class306.method2394(arg2 ^ 32436, arg1, arg0);
               if (~class402.field5939 == -1) {
                  class75.field1330 = null;
                  class75.field1330 = class393.field5787.method301(class393.field5787.method263(class220.field3311, class31.field473), class393.field5787.method358(class220.field3311, class31.field473));
                  if (!var3) {
                     break label62;
                  }
               }

               if (class402.field5939 == 1 && (class80.field1360 == null || ~class547.field7911 != ~var4 || ~class124.field2039 != ~var5)) {
                  class80.field1360 = new class723[class547.field7911 * class124.field2039];
                  int var6 = 0;
                  if (var3) {
                     class80.field1360[var6] = class393.field5787.method301(class393.field5787.method263(class438.field6324, class335.field4788), class393.field5787.method358(class438.field6324, class335.field4788));
                     ++var6;
                  }

                  while(true) {
                     while(var6 < class80.field1360.length) {
                        class80.field1360[var6] = class393.field5787.method301(class393.field5787.method263(class438.field6324, class335.field4788), class393.field5787.method358(class438.field6324, class335.field4788));
                        ++var6;
                     }

                     class74.field1314 = new int[class547.field7911 * class124.field2039];
                     if (!var3) {
                        class618.field8980 = 1;
                        break;
                     }

                     ++var6;
                  }
               }
            }

            class186.field2818 = true;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3187[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(IIBI)V"
   )
   public final void method1814(int arg0, int arg1, byte arg2, int arg3) {
      try {
         super.field9072 = arg1;
         int var5 = 72 % ((arg2 - -62) / 32);
         super.field9066 = arg3;
         ++field3180;
         super.field9064 = arg0;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3187[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class213(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!oc",
      name = "g",
      descriptor = "(B)V"
   )
   public static void method1815(byte arg0) {
      try {
         if (arg0 == 17) {
            field3185 = null;
            field3183 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3187[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public static final boolean method1816(int arg0, boolean arg1) {
      try {
         ++field3181;
         if (arg1) {
            return false;
         } else {
            return arg0 == 4 || arg0 == 8 || ~arg0 == -12;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3187[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1817(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1818(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
