import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class544 {
   @OriginalMember(
      owner = "client!rw",
      name = "g",
      descriptor = "Z"
   )
   public boolean field7950 = false;
   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7957 = new String[]{method4118(method4117("z($:;")), method4118(method4117("sq$Un")), method4118(method4117("f*f\u0017")), method4118(method4117("z($9;")), method4118(method4117("z($>;")), method4118(method4117("z($=;")), method4118(method4117("z($?;")), method4118(method4117("z($<;"))};
   @OriginalMember(
      owner = "client!rw",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field7955 = new int[4];
   @OriginalMember(
      owner = "client!rw",
      name = "e",
      descriptor = "I"
   )
   public static int field7946;
   @OriginalMember(
      owner = "client!rw",
      name = "i",
      descriptor = "I"
   )
   public static int field7947;
   @OriginalMember(
      owner = "client!rw",
      name = "h",
      descriptor = "I"
   )
   public int field7948;
   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "I"
   )
   public static int field7949;
   @OriginalMember(
      owner = "client!rw",
      name = "d",
      descriptor = "I"
   )
   public static int field7951;
   @OriginalMember(
      owner = "client!rw",
      name = "c",
      descriptor = "I"
   )
   public int field7953;
   @OriginalMember(
      owner = "client!rw",
      name = "f",
      descriptor = "I"
   )
   public static int field7954;
   @OriginalMember(
      owner = "client!rw",
      name = "k",
      descriptor = "I"
   )
   public static int field7956;
   @OriginalMember(
      owner = "client!rw",
      name = "j",
      descriptor = "Lcka;"
   )
   public class193 field7952;

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(ILgea;B)V"
   )
   private final void method4110(int arg0, class66 arg1, byte arg2) {
      try {
         ++field7946;
         int var4 = 6 % ((5 - arg2) / 61);
         if (arg0 != 1) {
            if (arg0 == 2) {
               this.field7953 = arg1.method645((byte)-26);
               return;
            }

            if (~arg0 == -4) {
               this.field7950 = true;
               return;
            }

            if (arg0 == 4) {
               this.field7948 = -1;
               return;
            }
         } else {
            this.field7948 = arg1.method603(-2);
         }

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7957[5] + arg0 + ',' + (arg1 != null ? field7957[1] : field7957[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(ZIB)V"
   )
   public static final void method4111(boolean param0, int param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(ILha;ZZ)Lpd;"
   )
   public final class648 method4112(int arg0, class479 arg1, boolean arg2, boolean arg3) {
      boolean var5 = client.field1481;

      try {
         ++field7947;
         long var6 = (long)(arg1.field6659 << 19 | this.field7948 | arg0 << 16 | (arg3 ? 262144 : 0));
         if (arg2) {
            field7955 = null;
         }

         class648 var8 = (class648)this.field7952.field2454.method3192(var6, (byte)-119);
         if (var8 != null) {
            return var8;
         } else if (!this.field7952.field2444.method2681((byte)72, this.field7948)) {
            return null;
         } else {
            class65 var9 = class65.method589(this.field7952.field2444, this.field7948, 0);
            if (var9 != null) {
               var9.field821 = var9.field816 = var9.field817 = var9.field814 = 0;
               if (arg3) {
                  var9.method588();
               }

               int var10 = 0;
               if (var5) {
                  var9.method579();
                  ++var10;
               }

               while(arg0 > var10) {
                  var9.method579();
                  ++var10;
               }
            }

            class648 var11 = arg1.method402(var9, true);
            if (var11 != null) {
               this.field7952.field2454.method3190(var11, var6, 8);
            }

            return var11;
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field7957[7] + arg0 + ',' + (arg1 != null ? field7957[1] : field7957[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(BLgea;)V"
   )
   public final void method4113(byte arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         ++field7949;
         if (arg0 <= 114) {
            this.field7952 = null;
         }

         do {
            int var4 = arg1.method640(255);
            if (~var4 == -1) {
               break;
            }

            this.method4110(var4, arg1, (byte)67);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field7957[3] + arg0 + ',' + (arg1 != null ? field7957[1] : field7957[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method4114(byte arg0) {
      try {
         int var2 = -33 % ((5 - arg0) / 54);
         ++field7956;
         return this.field7952.field2444.method2681((byte)85, this.field7948);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7957[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "()V"
   )
   public static final void method4115() {
      class12.method107(1, class174.field2251);
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4116(int arg0) {
      try {
         if (arg0 <= -51) {
            field7955 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7957[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4117(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4118(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
