import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class786 implements class122 {
   @OriginalMember(
      owner = "client!qf",
      name = "g",
      descriptor = "Lpq;"
   )
   private class195 field11476;
   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "I"
   )
   public int field11477;
   @OriginalMember(
      owner = "client!qf",
      name = "l",
      descriptor = "I"
   )
   public int field11480;
   @OriginalMember(
      owner = "client!qf",
      name = "m",
      descriptor = "[I"
   )
   public int[] field11486;
   @OriginalMember(
      owner = "client!qf",
      name = "i",
      descriptor = "Lss;"
   )
   private class308 field11483;
   @OriginalMember(
      owner = "client!qf",
      name = "h",
      descriptor = "[F"
   )
   public float[] field11479;
   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11488 = new String[]{method5672(method5671("pH><A")), method5672(method5671("pH>>A")), method5672(method5671("pH>A\u0000oGdCA")), method5672(method5671("o[|\u0011")), method5672(method5671("z\u0000>S\u0014")), method5672(method5671("pH>9A")), method5672(method5671("pH>?A"))};
   @OriginalMember(
      owner = "client!qf",
      name = "f",
      descriptor = "I"
   )
   public static int field11487;
   @OriginalMember(
      owner = "client!qf",
      name = "j",
      descriptor = "I"
   )
   public static int field11475;
   @OriginalMember(
      owner = "client!qf",
      name = "e",
      descriptor = "I"
   )
   public static int field11478;
   @OriginalMember(
      owner = "client!qf",
      name = "b",
      descriptor = "I"
   )
   public static int field11481;
   @OriginalMember(
      owner = "client!qf",
      name = "c",
      descriptor = "I"
   )
   public static int field11482;
   @OriginalMember(
      owner = "client!qf",
      name = "k",
      descriptor = "I"
   )
   public static int field11484;
   @OriginalMember(
      owner = "client!qf",
      name = "d",
      descriptor = "I"
   )
   public static int field11485;

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5669(int arg0, int arg1) {
      try {
         int var2 = 58 % ((20 - arg1) / 37);
         ++field11485;
         class487 var3 = class2.method12((long)arg0, 2, (byte)43);
         var3.method3696(-11118);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field11488[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(CB)Z"
   )
   public static final boolean method5670(char arg0, byte arg1) {
      try {
         ++field11482;
         if (arg0 >= ' ' && ~arg0 >= -127) {
            return true;
         } else {
            if (arg1 <= 57) {
               method5670('\t', (byte)61);
            }

            if (~arg0 <= -161 && ~arg0 >= -256) {
               return true;
            } else {
               return arg0 == 8364 || ~arg0 == -339 || ~arg0 == -8213 || ~arg0 == -340 || ~arg0 == -377;
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11488[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "b",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method1071(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         class694.method5061(this.field11476.field2468.field9291, arg3, this.field11480, arg6 ? this.field11486 : null, (byte)-125, !arg7 ? null : this.field11479, arg5, !arg7 ? null : this.field11476.field2496, arg4, arg2, arg0, arg1, this.field11476.field2468.field9287);
         ++field11478;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field11488[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "a",
      descriptor = "(IIIIIIZZ)V"
   )
   public final void method1072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         ++field11484;
         class694.method5061(this.field11486, arg3, this.field11476.field2468.field9287, arg6 ? this.field11476.field2468.field9291 : null, (byte)-125, !arg7 ? null : this.field11476.field2496, arg5, arg7 ? this.field11479 : null, arg4, arg2, arg0, arg1, this.field11480);
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field11488[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qf",
      name = "<init>",
      descriptor = "(Lpq;Lpd;Lss;)V"
   )
   public class786(class195 arg0, class648 arg1, class308 arg2) {
      try {
         label55: {
            this.field11476 = arg0;
            if (arg1 instanceof class701) {
               class701 var4 = (class701)arg1;
               this.field11477 = var4.field4151;
               this.field11480 = var4.field4169;
               this.field11486 = var4.field10261;
               if (!client.field1481) {
                  break label55;
               }
            }

            if (!(arg1 instanceof class298)) {
               throw new RuntimeException();
            }

            class298 var5 = (class298)arg1;
            this.field11480 = var5.field4169;
            this.field11486 = var5.field4179;
            this.field11477 = var5.field4151;
         }

         if (arg2 != null) {
            this.field11483 = arg2;
            if (this.field11483.field4313 == this.field11480 && ~this.field11483.field4312 == ~this.field11477) {
               this.field11479 = this.field11483.field4315;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field11488[2] + (arg0 != null ? field11488[4] : field11488[3]) + ',' + (arg1 != null ? field11488[4] : field11488[3]) + ',' + (arg2 != null ? field11488[4] : field11488[3]) + ')');
      }
   }

   static {
      new class292("", 73);
      field11487 = -1;
   }

   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5671(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5672(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
