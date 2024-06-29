import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public abstract class class626 extends class294 {
   @OriginalMember(
      owner = "client!kfa",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9119 = new String[]{method4589(method4588(" \rKXh")), method4589(method4588("5V\t\u001a")), method4589(method4588("0E\u0004XZs")), method4589(method4588("0E\u0004XPs")), method4589(method4588("0E\u0004XQ\u001a\u000b")), method4589(method4588("0E\u0004XR\u001a\u000b")), method4589(method4588("0E\u0004XTs")), method4589(method4588("0E\u0004XWs")), method4589(method4588("0E\u0004X)2M\f\u0002+s")), method4589(method4588("0E\u0004XS\u001a\u000b")), method4589(method4588("0E\u0004XVs")), method4589(method4588("0E\u0004XQs"))};
   @OriginalMember(
      owner = "client!kfa",
      name = "L",
      descriptor = "[C"
   )
   public static char[] field9107 = new char[]{'[', ']', '#'};
   @OriginalMember(
      owner = "client!kfa",
      name = "I",
      descriptor = "Z"
   )
   public static boolean field9115 = true;
   @OriginalMember(
      owner = "client!kfa",
      name = "F",
      descriptor = "I"
   )
   public static int field9116 = 0;
   @OriginalMember(
      owner = "client!kfa",
      name = "A",
      descriptor = "I"
   )
   public static int field9108;
   @OriginalMember(
      owner = "client!kfa",
      name = "M",
      descriptor = "I"
   )
   public static int field9109;
   @OriginalMember(
      owner = "client!kfa",
      name = "N",
      descriptor = "I"
   )
   public static int field9111;
   @OriginalMember(
      owner = "client!kfa",
      name = "H",
      descriptor = "I"
   )
   public static int field9112;
   @OriginalMember(
      owner = "client!kfa",
      name = "E",
      descriptor = "I"
   )
   public static int field9113;
   @OriginalMember(
      owner = "client!kfa",
      name = "D",
      descriptor = "I"
   )
   public static int field9114;
   @OriginalMember(
      owner = "client!kfa",
      name = "C",
      descriptor = "I"
   )
   public static int field9117;
   @OriginalMember(
      owner = "client!kfa",
      name = "J",
      descriptor = "I"
   )
   public static int field9118;
   @OriginalMember(
      owner = "client!kfa",
      name = "K",
      descriptor = "Lan;"
   )
   public static class25 field9110;

   @OriginalMember(
      owner = "client!kfa",
      name = "b",
      descriptor = "(ILha;)Z"
   )
   public final boolean method1362(int arg0, class65 arg1) {
      try {
         if (arg0 != 0) {
            return false;
         } else {
            ++field9111;
            class533 var3 = class132.method1260(super.field4090, super.field4101 >> class76.field1336, super.field4096 >> class76.field1336);
            return var3 != null && var3.field7766.field2349 ? class98.method935(-101, super.field4090, super.field4101 >> class76.field1336, var3.field7766.method589(19053) - -this.method589(19053), super.field4096 >> class76.field1336) : class310.method2416(super.field4101 >> class76.field1336, super.field4096 >> class76.field1336, super.field4090, -124);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9119[5] + arg0 + ',' + (arg1 != null ? field9119[0] : field9119[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "i",
      descriptor = "(I)Z"
   )
   public final boolean method1365(int arg0) {
      try {
         ++field9118;
         return arg0 != -1 ? true : class750.field10812[(super.field4101 >> class76.field1336) + -class566.field8206 + class54.field1102][(super.field4096 >> class76.field1336) - -class54.field1102 + -class115.field1864];
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9119[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class626(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         super.field4090 = (byte)arg3;
         super.field4096 = arg2;
         super.field4097 = arg1;
         super.field4091 = (byte)arg4;
         super.field4101 = arg0;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field9119[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method594(int arg0) {
      try {
         if (arg0 != 255) {
            this.method601(-39);
         }

         ++field9114;
         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9119[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "([[BLgha;I)V"
   )
   public static final void method4585(byte[][] param0, class363 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "g",
      descriptor = "(I)Z"
   )
   public final boolean method601(int arg0) {
      try {
         if (arg0 != 0) {
            this.method1365(-82);
         }

         ++field9117;
         return false;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9119[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "([Lke;B)I"
   )
   public final int method1366(class622[] arg0, byte arg1) {
      try {
         if (arg1 >= -57) {
            field9116 = 34;
         }

         ++field9109;
         return this.method2296(super.field4096 >> class76.field1336, arg0, super.field4101 >> class76.field1336, true);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9119[9] + (arg0 != null ? field9119[0] : field9119[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(IZLvca;Lha;III)V"
   )
   public final void method579(int arg0, boolean arg1, class294 arg2, class65 arg3, int arg4, int arg5, int arg6) {
      try {
         ++field9113;
         if (arg5 != 0) {
            field9110 = null;
         }

         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field9119[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9119[0] : field9119[1]) + ',' + (arg3 != null ? field9119[0] : field9119[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4586(byte arg0) {
      try {
         field9107 = null;
         field9110 = null;
         if (arg0 != 24) {
            field9110 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9119[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "a",
      descriptor = "(BI)Lgja;"
   )
   public static final class53 method4587(byte arg0, int arg1) {
      try {
         if (arg0 != -127) {
            method4587((byte)116, 17);
         }

         ++field9108;
         class53 var2 = (class53)class299.field4191.method1584((long)arg1, arg0 + 128);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class465.field6802.method1347((byte)125, 0, arg1);
            class53 var4 = new class53();
            if (var3 != null) {
               var4.method633((byte)77, arg1, new class473(var3));
            }

            class299.field4191.method1581((long)arg1, 0, var4);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9119[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4588(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4589(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
