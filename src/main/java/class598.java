import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class598 extends class76 {
   @OriginalMember(
      owner = "client!im",
      name = "I",
      descriptor = "Ljava/lang/String;"
   )
   public String field8793;
   @OriginalMember(
      owner = "client!im",
      name = "N",
      descriptor = "Luda;"
   )
   public class478 field8795;
   @OriginalMember(
      owner = "client!im",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8800 = new String[]{method4352(method4351("h\u0017 `{")), method4352(method4351("zT \u0006.")), method4352(method4351("o\u000fbD")), method4352(method4351("h\u0017 m{")), method4352(method4351("h\u0017 \u0014:o\u0013z\u0016{")), method4352(method4351("h\u0017 l{")), method4352(method4351("h\u0017 i{")), method4352(method4351("h\u0017 n{")), method4352(method4351("h\u0017 o{")), method4352(method4351("h\u0017 j{")), method4352(method4351("h\u0017 k{"))};
   @OriginalMember(
      owner = "client!im",
      name = "B",
      descriptor = "I"
   )
   public int field8785;
   @OriginalMember(
      owner = "client!im",
      name = "E",
      descriptor = "I"
   )
   public static int field8786;
   @OriginalMember(
      owner = "client!im",
      name = "D",
      descriptor = "I"
   )
   public static int field8788;
   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "I"
   )
   public static int field8790;
   @OriginalMember(
      owner = "client!im",
      name = "O",
      descriptor = "I"
   )
   public static int field8791;
   @OriginalMember(
      owner = "client!im",
      name = "C",
      descriptor = "I"
   )
   public static int field8792;
   @OriginalMember(
      owner = "client!im",
      name = "A",
      descriptor = "I"
   )
   public static int field8794;
   @OriginalMember(
      owner = "client!im",
      name = "H",
      descriptor = "I"
   )
   public static int field8797;
   @OriginalMember(
      owner = "client!im",
      name = "L",
      descriptor = "I"
   )
   public static int field8798;
   @OriginalMember(
      owner = "client!im",
      name = "K",
      descriptor = "I"
   )
   public static int field8799;
   @OriginalMember(
      owner = "client!im",
      name = "M",
      descriptor = "Lkf;"
   )
   public static class266 field8789;
   @OriginalMember(
      owner = "client!im",
      name = "G",
      descriptor = "Lfl;"
   )
   public static class772 field8787;
   @OriginalMember(
      owner = "client!im",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field8796;

   @OriginalMember(
      owner = "client!im",
      name = "c",
      descriptor = "(B)V",
      line = 7
   )
   public static void method4343(byte arg0) {
      try {
         field8789 = null;
         field8796 = null;
         if (arg0 <= -36) {
            field8787 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8800[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(IZ)V",
      line = 22
   )
   public static final void method4344(int arg0, boolean arg1) {
      try {
         class224.field3191 = arg0;
         class74.field908 = -1;
         if (!arg1) {
            method4348((class534)null, 5);
         }

         ++field8797;
         class74.field908 = -1;
         class707.method5142(0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8800[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(Liha;B)Z",
      line = 36
   )
   public final boolean method4345(class32 arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field8788;
         boolean var4 = true;
         arg0.method693((byte)-82);
         class32 var5 = (class32)this.field8795.method3488(arg1);
         boolean var10000;
         if (var3) {
            var10000 = class183.method1456(2, var5.field458, arg0.field458);
         } else if (var5 == null) {
            this.field8795.method3486(arg0, 1779380172);
            ++this.field8785;
            var10000 = var4;
            if (!var3) {
               return var4;
            }
         } else {
            var10000 = class183.method1456(2, var5.field458, arg0.field458);
         }

         while(!var10000) {
            var4 = false;
            var5 = (class32)this.field8795.method3484(0);
            if (var5 == null) {
               this.field8795.method3486(arg0, 1779380172);
               ++this.field8785;
               var10000 = var4;
               if (!var3) {
                  return var4;
               }
            } else {
               var10000 = class183.method1456(2, var5.field458, arg0.field458);
            }
         }

         class102.method850(arg0, 124, var5);
         ++this.field8785;
         if (var4) {
            return false;
         } else {
            return true;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field8800[7] + (arg0 != null ? field8800[1] : field8800[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(IIII)I",
      line = 66
   )
   public static final int method4346(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8799;
         int var4 = arg1 / arg2;
         int var5 = arg1 & arg2 - 1;
         int var6 = arg0 / arg2;
         int var7 = arg0 & arg2 + -1;
         int var8 = class179.method1432(var6, arg3 + -21811, var4);
         int var9 = class179.method1432(var6, -10281, var4 + 1);
         int var10 = class179.method1432(var6 + 1, -10281, var4);
         int var11 = class179.method1432(var6 + 1, -10281, var4 - -1);
         int var12 = class753.method5465(arg2, var5, (byte)-101, var8, var9);
         int var13 = class753.method5465(arg2, var5, (byte)-113, var10, var11);
         if (arg3 != 11530) {
            method4347((class147)null, true);
         }

         return class753.method5465(arg2, var7, (byte)-75, var12, var13);
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field8800[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(Lwf;Z)Ljava/lang/String;",
      line = 97
   )
   public static final String method4347(class147 arg0, boolean arg1) {
      try {
         if (!arg1) {
            return null;
         } else {
            ++field8791;
            return class300.method2239(32767, 81, arg0);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8800[5] + (arg0 != null ? field8800[1] : field8800[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(Lbda;I)V",
      line = 109
   )
   public static final void method4348(class534 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!im",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 186
   )
   public class598(String arg0) {
      try {
         this.field8793 = arg0;
         this.field8795 = new class478();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8800[4] + (arg0 != null ? field8800[1] : field8800[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(BLiha;)Z",
      line = 195
   )
   public final boolean method4349(byte arg0, class32 arg1) {
      try {
         ++field8792;
         int var3 = this.method4350(32767);
         if (arg0 > -48) {
            return true;
         } else {
            arg1.method693((byte)-71);
            --this.field8785;
            if (this.field8785 == 0) {
               this.method3165(120);
               this.method693((byte)-83);
               --class578.field8529;
               class773.field11360.method723(0, arg1.field465, this);
               return false;
            } else {
               return this.method4350(32767) != var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field8800[8] + arg0 + ',' + (arg1 != null ? field8800[1] : field8800[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(I)I",
      line = 222
   )
   public final int method4350(int arg0) {
      try {
         ++field8786;
         if (arg0 != 32767) {
            field8796 = null;
         }

         return this.field8795.field6868.field950 != this.field8795.field6868 ? ((class32)this.field8795.field6868.field950).field458 : -1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8800[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4351(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4352(char[] arg0) {
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
            var10005 = 122;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
