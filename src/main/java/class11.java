import java.io.DataInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!da")
public class class11 {
   @OriginalMember(
      owner = "loginapplet!da",
      name = "a",
      descriptor = "Lsa;"
   )
   public static class41 field85 = class3.method9(20, (byte)26);
   @OriginalMember(
      owner = "loginapplet!da",
      name = "b",
      descriptor = "Ljava/io/DataInputStream;"
   )
   public static DataInputStream field86;
   @OriginalMember(
      owner = "loginapplet!da",
      name = "c",
      descriptor = "I"
   )
   public static int field87 = 0;
   @OriginalMember(
      owner = "loginapplet!da",
      name = "d",
      descriptor = "Z"
   )
   public static volatile boolean field88 = true;

   @OriginalMember(
      owner = "loginapplet!da",
      name = "a",
      descriptor = "(BI)[B",
      line = 7
   )
   public static final synchronized byte[] method47(byte arg0, int arg1) {
      try {
         byte[] var2;
         if (arg1 == 100 && ~class45.field336 < -1) {
            var2 = class12.field95[--class45.field336];
            class12.field95[class45.field336] = null;
            return var2;
         } else {
            if (arg0 >= 0) {
               field87 = -123;
            }

            if (arg1 == 5000 && -1 > ~class10.field79) {
               var2 = class34.field225[--class10.field79];
               class34.field225[class10.field79] = null;
               return var2;
            } else if (arg1 == 30000 && class46.field339 > 0) {
               var2 = class45.field333[--class46.field339];
               class45.field333[class46.field339] = null;
               return var2;
            } else {
               return new byte[arg1];
            }
         }
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "da.C(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!da",
      name = "a",
      descriptor = "(Z)V",
      line = 60
   )
   public static void method48(boolean arg0) {
      try {
         if (arg0) {
            field86 = (DataInputStream)null;
         }

         field86 = null;
         field85 = null;
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "da.B(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!da",
      name = "a",
      descriptor = "(IZ)I",
      line = 72
   )
   public static final int method49(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            method49(-125, true);
         }

         return (int)(Math.cos(0.01D * (double)arg0) * 10.0D);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "da.A(" + arg0 + ',' + arg1 + ')');
      }
   }
}
