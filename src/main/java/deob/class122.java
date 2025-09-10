package deob;

import java.net.URL;

@ObfuscatedName("ea")
public class class122 {

	@ObfuscatedName("ea.af")
	public static int field1563 = -1;

	@ObfuscatedName("ea.aw")
	public static int field1559 = -2;

	@ObfuscatedName("ea.at")
	public final URL field1560;

	@ObfuscatedName("ea.ac")
	public volatile int field1558 = field1563;

	@ObfuscatedName("ea.ap")
	public volatile byte[] field1561;

	public class122(URL arg0) {
		this.field1560 = arg0;
	}

	@ObfuscatedName("ea.af(B)Z")
	public boolean method3382() {
		return field1563 != this.field1558;
	}

	@ObfuscatedName("ea.aw(I)[B")
	public byte[] method3383() {
		return this.field1561;
	}

	@ObfuscatedName("ea.at(I)Ljava/lang/String;")
	public String method3390() {
		return this.field1560.toString();
	}
}
