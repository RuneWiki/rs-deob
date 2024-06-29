import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class790 extends class302 {
   @OriginalMember(
      owner = "client!eca",
      name = "L",
      descriptor = "I"
   )
   private int field11479 = 0;
   @OriginalMember(
      owner = "client!eca",
      name = "P",
      descriptor = "I"
   )
   private int field11478 = 4096;
   @OriginalMember(
      owner = "client!eca",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11484 = new String[]{method5670(method5669("\u007f#?5 ")), method5670(method5669("jx}w")), method5670(method5669("anp5\u001b,")), method5670(method5669("anp5\u001e,")), method5670(method5669("anp5\u001c,"))};
   @OriginalMember(
      owner = "client!eca",
      name = "Q",
      descriptor = "[B"
   )
   public static byte[] field11482 = new byte[2048];
   @OriginalMember(
      owner = "client!eca",
      name = "J",
      descriptor = "Lsda;"
   )
   public static class269 field11476 = new class269(50, 11);
   @OriginalMember(
      owner = "client!eca",
      name = "H",
      descriptor = "D"
   )
   public static double field11481;
   @OriginalMember(
      owner = "client!eca",
      name = "O",
      descriptor = "I"
   )
   public static int field11474;
   @OriginalMember(
      owner = "client!eca",
      name = "K",
      descriptor = "I"
   )
   public static int field11475;
   @OriginalMember(
      owner = "client!eca",
      name = "R",
      descriptor = "I"
   )
   public static int field11477;
   @OriginalMember(
      owner = "client!eca",
      name = "M",
      descriptor = "I"
   )
   public static int field11483;
   @OriginalMember(
      owner = "client!eca",
      name = "N",
      descriptor = "[B"
   )
   public static byte[] field11480;

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(II)[I",
      line = 4
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field11483;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int[] var5 = this.method2299(arg0, false, 0);
            int var6 = 0;
            if (var3 != 0 || ~var6 > ~class344.field5238) {
               do {
                  int var7 = var5[var6];
                  var4[var6] = var7 >= this.field11479 ? (~this.field11478 <= ~var7 ? 4096 : 0) : 0;
                  ++var6;
               } while(~var6 > ~class344.field5238);
            }
         }

         if (arg1 >= -37) {
            field11482 = null;
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field11484[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(IILjj;)V",
      line = 39
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label37: {
            label36: {
               ++field11475;
               if (~arg0 != -1) {
                  if (arg0 != 1) {
                     break label37;
                  }

                  if (var4 == 0) {
                     break label36;
                  }
               }

               this.field11479 = arg2.method1038((byte)-111);
               if (var4 == 0) {
                  break label37;
               }
            }

            this.field11478 = arg2.method1038((byte)-112);
         }

         if (arg1 != 0) {
            this.field11478 = -28;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11484[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11484[0] : field11484[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "<init>",
      descriptor = "()V",
      line = 149
   )
   public class790() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!eca",
      name = "a",
      descriptor = "(Lvs;Z[[[BIB)Z",
      line = 86
   )
   public static final boolean method5667(class616 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
      if (!class377.field5713) {
         return false;
      } else {
         int var5 = arg0.field9003 >> class459.field6950;
         int var6 = var5;
         int var7 = arg0.field9007 >> class459.field6950;
         int var8 = var7;
         if (arg0 instanceof class741) {
            var6 = ((class741)arg0).field10990;
            var8 = ((class741)arg0).field10992;
            var5 = ((class741)arg0).field10995;
            var7 = ((class741)arg0).field11000;
         }

         for(int var9 = var5; var9 <= var6; ++var9) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (arg0.field9005 < class424.field6437 && var9 >= class598.field8800 && var9 < class662.field9587 && var10 >= class774.field11330 && var10 < class393.field5964) {
                  if ((arg2 == null || arg0.field9010 < arg3 || arg2[arg0.field9010][var9][var10] != arg4) && arg0.method1883(false) && !arg0.method1880((byte)104, class261.field3550)) {
                     return false;
                  }

                  if (!arg1 && var9 >= class681.field10228 - 16 && var9 <= class681.field10228 + 16 && var10 >= class518.field7555 - 16 && var10 <= class518.field7555 + 16) {
                     if (class667.field9877) {
                        class688.field10367[class219.field2792++].method3073(arg0, true);
                        class219.field2792 %= class705.field10556;
                     } else {
                        arg0.method4(class261.field3550, 50);
                     }
                  }
               }
            }
         }

         return true;
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "f",
      descriptor = "(I)V",
      line = 165
   )
   public static void method5668(int arg0) {
      try {
         field11482 = null;
         field11476 = null;
         field11480 = null;
         if (arg0 != 50) {
            field11482 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11484[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5669(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5670(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
